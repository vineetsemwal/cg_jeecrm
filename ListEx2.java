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

demo.sortList(list);
demo.display(list);
}

public void display(List<Employee>list)
{
for(Employee iterated:list){
System.out.println("name="+iterated.name+",age="+iterated.age);
}
}

public List<Employee> sortList(List<Employee>list)
{
Comparator<Employee>nameComp=new AgeComparator();
list.sort(nameComp);
return list;

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

