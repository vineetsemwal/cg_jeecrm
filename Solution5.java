class Solution5 {
    public static void main(String args[]) {
        String seller = "nivedita";
        String buyer = "Vaibhav";
        TransactionParty party = new TransactionParty(seller, buyer);
        String qr = "Sky";
        Receipt receipt = new Receipt(party, qr);
        GenerateReceipt gr = new GenerateReceipt();
        int result = gr.verifyParty(receipt);
        System.out.println(result);

    }
}

class TransactionParty {
    String seller;
    String buyer;

    public TransactionParty(String seller, String buyer) {
        this.seller = seller;
        this.buyer = buyer;
    }
}

class Receipt {
    TransactionParty transactionParty;
    String productsQR;

    public Receipt(TransactionParty transactionParty, String productsQR) {
        this.transactionParty = transactionParty;
        this.productsQR = productsQR;
    }
}

class GenerateReceipt {
    public int verifyParty(Receipt r) {
        TransactionParty party = r.transactionParty;
        String seller = party.seller;
        String buyer = party.buyer;

        boolean isbuyer = validate(buyer);
        boolean isseller = validate(seller);

        if (isbuyer && isseller) return 2;
        if (isbuyer || isseller) return 1;
        return 0;

    }

    public boolean validate(String name) {
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        boolean firstalphabet = isAlphabet(firstChar);
        boolean lastalphabet = isAlphabet(lastChar);


        if (!firstalphabet || !lastalphabet) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            String chstr = ch + "";
            boolean ishypen = chstr.equals("-");
            boolean isquote = chstr.equals("'");
            boolean isWhitespace = chstr.isEmpty();
            boolean isAlphabet=isAlphabet(ch);


            if (!ishypen && !isquote && !isWhitespace && !isAlphabet) {
                System.out.println("not hyphen quote white");
                return false;
            }
        }

        return true;
    }

    public boolean isAlphabet(char ch) {
        boolean result = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        return result;
    }
}

