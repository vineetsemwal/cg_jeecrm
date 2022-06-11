


class GenericEx{

public static void main(String args[]){
Store<String> store=new Store<>();
store.add("hi");
String value=store.getElement();
System.out.println("stored value"+value);
}

}


class Store<T>{

private T element;

public void add(T element){
this.element=element;
}

public T getElement(){
return element;
}

}


