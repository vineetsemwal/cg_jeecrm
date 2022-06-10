
class StringBuilderEx{

public static void main(String args[]){
StringBuilderEx demo=new StringBuilderEx();
String result=demo.concatNumbers();
System.out.println(result);
}


String concatNumbers(){
StringBuilder result=new StringBuilder();
for(int i=0;i<=10;i++){
result.append(i);

}
String desired=result.toString();
return desired;

}


}
