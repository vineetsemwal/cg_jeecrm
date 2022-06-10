

public class StringEx3{


public static void main(String args[])
{
 String input="mumbai";
 StringEx3 demo=new StringEx3();
 String result=demo.reverseString(input);
 System.out.println(result);
}



 public String reverseString(String input){ 
 StringBuilder builder=new StringBuilder();
 builder.append(input);
builder.reverse();
String result=builder.toString();
 return result;
 }


}
