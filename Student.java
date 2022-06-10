
class Student{
String name;

@Override
public boolean equals(Object obj){
if(obj==this){
return true;
}

if(obj==null  || !(obj instanceof Student) ){
return false;
}

Student that=(Student) obj;

boolean flag=this.name.equals(that.name);
return flag;

}

@Override
public String toString(){
String str=name;
return str;
}

}
