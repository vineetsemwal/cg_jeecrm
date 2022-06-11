

class InterfaceEx{

public static void main(String args[]){

ICalculator calcy=new CasioCalculator();
int result=calcy.add(1,2);
System.out.println(result);
}


}


interface ICalculator{
int add(int num1, int num2);

}

class CasioCalculator implements ICalculator{

@Override
public int add(int num1, int num2){
return num1+num2;
}

}

class SamsungCalculator implements ICalculator{

@Override
public int add(int num1, int num2){
return num1+num2;
}

}
