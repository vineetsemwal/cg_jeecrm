class Solution5 {
    public static void main(String args[]) {
        String seller = "nivedita";
        String buyer = "Vaibhav";
        TransactionParty party = new TransactionParty(seller, buyer);
        String qr = "250,10@100,3@50,7";
        Receipt receipt = new Receipt(party, qr);
        GenerateReceipt gr = new GenerateReceipt();
        int verifyResult = gr.verifyParty(receipt);
        System.out.println("verify result="+verifyResult);
        String gst=gr.calcGST(receipt);
        System.out.println("gst="+gst);
                
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
            boolean isWhitespace = chstr.isBlank();
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
    
    /*
    "250,10@100,3@50,7"
    */
    public String calcGST(Receipt r){
    String qr=r.productsQR;
    String products[]=qr.split("@");
    int total=0;
    for(String product:products){
     int commaStart=product.indexOf(",");
     String rateText=product.substring(0,commaStart);
     String quantityText=product.substring(commaStart+1);
     int rate=Integer.parseInt(rateText);
     int quantity=Integer.parseInt(quantityText);
     int productTotalVal=rate*quantity;
     total=total+productTotalVal;   
        
        }
        
      int gst=total*12;
        
      String desired=""+gst;
      return desired;  
    }
        
    
        
}

