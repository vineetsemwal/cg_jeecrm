import java.util.*;

class SetEx2{


public static void main(String args[]){

Comparator<Employee>ageComp=new AgeComparator();
Set<Employee>set=new TreeSet<>(ageComp);
Employee emp1=new Employee("vaibhav",22);
Employee emp2=new Employee("akash",23);
Employee emp3=new Employee("pragya",21);
Employee emp4=new Employee("nivedhita",24);
set.add(emp1);
set.add(emp2);
set.add(emp3);
set.add(emp4);

for(Employee iterated:set){
System.out.println(iterated.name+","+iterated.age);

}

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

