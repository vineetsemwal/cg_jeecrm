import java.util.*;

class MapEx2{


public static void main(String args[])
{
Comparator<String>comparator=new NameComparator(); 
Map<String,Employee>map=new TreeMap<>(comparator);
Employee emp1=new Employee("vaibhav",22);
Employee emp2=new Employee("akash",23);
Employee emp3=new Employee("pragya",21);
Employee emp4=new Employee("nivedhita",24);
map.put(emp1.name,emp1);
map.put(emp2.name,emp2);
map.put(emp3.name,emp3);

Set<String> keys=map.keySet();
for(String key:keys)
{

Employee value=map.get(key);
System.out.println(value.name+","+value.age);
}

}
}



class NameComparator implements Comparator<String>{

public int compare(String name1, String name2){
int comparison=name1.compareTo(name2);
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

