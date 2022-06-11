import java.util.*;


class ListEx1{


public static void main(String args[]){
List<String>list=new ArrayList<>();
list.add("hi");
list.add("bye");
list.add("good");
String elementIndex1=list.get(1);
list.set(1,"bad");

list.add(0,"hey");

for(String element:list)
{
System.out.println("element="+element);
}


int size=list.size();
System.out.println("size="+size);
}


}

