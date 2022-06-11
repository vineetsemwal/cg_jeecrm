


class ExceptionEx1{


public static void main(String args[]){

ExceptionEx1 demo=new ExceptionEx1();
String input=null;
try{
demo.printEmployeeInfo(input);
}


catch(NullPointerException e){
System.out.println("input is null");
}

catch(Exception e ){
System.out.println("something went wrong");
}


System.out.println("bye, ending main");

}



//name,age
public void printEmployeeInfo(String input){
System.out.println("inside princtEmployeeInfo");
String parts[]= input.split(",");
String name=parts[0];
String age=parts[1];
System.out.println("name="+name+" age="+age);
}



}

