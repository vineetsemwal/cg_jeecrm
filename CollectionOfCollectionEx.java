import java.util.*;


class CollectionOfCollectionEx{


 public static void main(String args[]){
 
 List<String>fruits=new ArrayList<>();
 fruits.add("mango");
 fruits.add("apple");
 
 List<String>vegetables=new ArrayList<>();
 vegetables.add("pumpkin");
 vegetables.add("potato");
 
 
 List<List<String>> listOfList=new ArrayList<>();
 listOfList.add(fruits);
 listOfList.add(vegetables);
 
 System.out.println(listOfList);
 
 
 
 }




}
