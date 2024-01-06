//INHERITANCE -> used to borrow properties and methods from an existing class. inheritance in java is declared using extends keyword.

class Base{
    int a;
public int geta(){return a;}
public void seta(int a){
System.out.println("This is the base class to let u understand the inheritance .");
this.a=a;}
public void printme(){
System.out.println("Laugh and be happy u r half wau to ur success. ");    }
}

class Derived extends Base{  //By using this all the statements written in base class will be accesible to this class so we need not to write same thing multiple times.
int y;
public int gety(){return y;}
public void sety(int y){this.y=y;}


}

public class vid45inheritance {
    public static void main(String[] args) {

Base bc = new Base(); //Object of base class
// Derived bc = new Derived(); //This is an object of derived class .By using this u can call base class functions
bc.seta(5);
System.out.println(bc.geta());

Derived d = new Derived();
d.seta(7);
System.out.println(d.geta());
d.sety(123);
System.out.println(d.gety());



    }
}
