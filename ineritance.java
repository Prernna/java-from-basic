
class Base{

    Base(){
System.out.println("I am a constructor in this Inheritance class.");
    }
    Base(int a){
        System.out.println("I am a overloaded concstructor class with value of a :"+a); //it will only run if u give an super class in the derived class
    }
    
    public int x;

    public int getx(){return x;}
    public void setx(int x){this.x=x;}
}

class Derived extends Base{

Derived(){
    super(0); //Now it will run the argumented class of Base
    System.out.println("I am a derived class concstructor.");
}
Derived(int a,int b){
    super(a);
    System.out.println("I am a overloaded constructor of derived class with value of a as : "+b);
}

        public int b;
        
        public int getb(){return b;}
        public void setb(int b){this.b=b;}

    }
 
class childofderived extends Derived{
    childofderived(){
        System.out.println("i am a child of derived class");
    }
    childofderived(int x,int y,int z){
        super(y, z); //calls the constructor from the parent class.
        System.out.println("I am an overloaded class of derived with value of z as : "+ z);
    }
}

public class vid46ineritance2 {
    public static void main(String[] args) {
        
Base bb = new Base(); //Creating an object of the base class
 Derived d= new Derived(); //Creating an object for the derived class. It will call both base and derive functions
//Derived d2= new Derived(12,5); //Creating an object of derived class with parameters. 
bb.setx(5);
d.setb(5);
childofderived child = new childofderived(4,2,3);
//IF THIS CODE IS NOT RUNNING HERE RUN THIS IN ANY ONLINE COMPILER VS CODE MAY HAVE ANY EXTENSION PROBLEM.

}
}

 
