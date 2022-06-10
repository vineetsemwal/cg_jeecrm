/*
        String str="Arpit.MehtaID123456DTIT80L";
        create employee object and populate data
*/



public class StringEx2{

public static void main(String args[]){
String input="Arpit.MehtaID123456DTIT80L";
 Converter converter=new Converter();
 Employee emp=converter.toEmployee(input);
 System.out.println("employee="+"id"+emp.id+"," +emp.firstName+","+emp.lastName+","+emp.salaryInLac );  
}


}



class Converter{

public Employee toEmployee(String input){
Employee emp=new Employee();
int idStart=input.indexOf("ID"); 
String name=input.substring(0,idStart);//Arpit.Mehta
System.out.println("name="+name);
int dotIndex=name.indexOf(".");
String firstName=name.substring(0,dotIndex);
String lastName=name.substring(dotIndex+1);
emp.firstName=firstName;
emp.lastName=lastName;
int dtStart=input.indexOf("DT");
int idValueIndex=idStart+2;
String idStr=input.substring(idValueIndex,dtStart);
int id=Integer.parseInt(idStr);
emp.id=id;
int dtValueStart=dtStart+2;
int dtValueEnd=dtValueStart+2;
String dept=input.substring(dtValueStart,dtValueEnd);
String salValueText=input.substring(dtValueEnd,input.length()-1);
long sal=Long.parseLong(salValueText);
emp.salaryInLac=sal;

return emp;
}



}



 class Employee{
 
 String firstName, lastName;
 int id;
 String department;
 long salaryInLac;
 
 public Employee(){
 }
 
 public Employee(int id, String first, String last,String dept, long sal){
 this.id=id;
 this.firstName=first;
 this.lastName=last;
 this.department=dept;
 this.salaryInLac=sal;
 
 }
  
 
 }




