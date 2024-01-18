/*Method overloading : is something in which under one class we have two methods of same name but differnet parameters.
 * Method Overriding : if the child class implements the same method present in the parent class again , it is known as method overrinding.Return type should be same or subtype of old return type.
 Static and final method cannot be overrided.
 */
class A{
    public int a;
    public int prerna(){ return 3+4;}
public void method2(){
    System.out.println("I am method 2 of class A");
}
}
class B extends A{
    @Override //this will help us to know weather our methods are overrinding or not. 
    public void method2(){
        System.out.println("I am method 2 of class B");
}
    public void method3(){
    System.out.println("I am method 3 of class B");
}
}


public class methodoverrinding {
    public static void main(String[] args) {
      
        A a = new A();
        a.method2();
        B b=new B();
        b.method2();
        b.method3();
        System.out.println();


    }
}
