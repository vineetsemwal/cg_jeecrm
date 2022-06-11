import java.util.*;


class ListEx2{


public static void main(String args[]){
ListEx2 demo=new ListEx2();
List<Employee>list=new ArrayList<>();
Employee emp1=new Employee("vaibhav",22);
Employee emp2=new Employee("akash",23);
Employee emp3=new Employee("pragya",21);
Employee emp4=new Employee("nivedhita",24);
list.add(emp1);
list.add(emp2);
list.add(emp3);
list.add(emp4);

System.out.println("**sorting list by age");
demo.sortListByAge(list);
demo.display(list);

System.out.println("**sorting list by name");
demo.sortListByName(list);
demo.display(list);
}

public void display(List<Employee>list)
{
for(Employee iterated:list){
System.out.println("name="+iterated.name+",age="+iterated.age);
}
}

public void sortListByAge(List<Employee>list)
{
Comparator<Employee>nameComp=new AgeComparator();
list.sort(nameComp);


}




public void sortListByName(List<Employee>list)
{
Comparator<Employee>nameComp=new NameComparator();
list.sort(nameComp);

}




}

class NameComparator implements Comparator<Employee>{

@Override
public int compare(Employee emp1, Employee emp2){
String name1=emp1.name;
String name2=emp2.name;
int comparison= name1.compareTo(name2);
return comparison;
}

}


class AgeComparator implements Comparator<Employee>{

@Override
public int compare(Employee emp1, Employee emp2){

int comparison=emp1.age-emp2.age;
return comparison;
}

} 


class Employee{

String name;

int age;
public Employee(String name, int age){
this.name=name;
this.age=age;
}

}

