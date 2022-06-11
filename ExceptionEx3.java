


class ExceptionEx3{


public static void main(String args[]){

ExceptionEx3 demo=new ExceptionEx3();
String input=null;
try{
demo.printEmployeeInfo(input);
}
catch(InvalidInputException e){
String msg=e.getMessage();
System.out.println(msg);
}

catch(Exception e){
String msg=e.getMessage();
System.out.println(msg+", something went wrong");
}

System.out.println("bye, ending main");

}



//name,age
public void printEmployeeInfo(String input) {
if(input==null){
throw new InvalidInputException("input is invalid");

}
System.out.println("inside princtEmployeeInfo");
String parts[]= input.split(",");
String name=parts[0];
String age=parts[1];
System.out.println("name="+name+" age="+age);
}


}

class InvalidInputException extends RuntimeException{

public InvalidInputException(){
}

public InvalidInputException(String msg){
super(msg);
}


}


