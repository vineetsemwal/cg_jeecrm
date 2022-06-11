import java.util.*;

class MapEx1{


public static void main(String args[])
{

Map<Integer,String>map=new HashMap<>();
map.put(3,"three");
map.put(1,"one");
map.put(2,"two");

String valueForKey1=map.get(1);
System.out.println("key 1, value="+valueForKey1);

Set<Integer>keys=map.keySet();
System.out.println("*iterating on keys");

for(Integer key:keys)
{
String value=map.get(key);
System.out.println("key="+key+",value="+value);
}

System.out.println("**iterating on values");
Collection<String>values=map.values();
for(String value:values){

System.out.println("value="+value);

}




}


}

