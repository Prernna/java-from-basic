
class one{
    int x;
    public int getx(){return x;}
    one(int y){
        this.x=y; //it is used to refer the variable even if the variables are same. if we put int as x then value will become x=x which will show error in the code so we use this keyword for reference.
        //this is a way for us to reference an object of the class which is being created/reffered.
    }
    public int returnpne(){
        return 1;
    }
}

/*Super keyword: A refernce used to refer immediate parent class object 
 * can be used to refer immediate parent class instance variable
 * can be used to invoke parent methods.
 * can be used to invoke parent class constructors.
*/
class two extends one{
    two(int a){
        super(a);
System.out.println("i am a constructor");
    }
}

public class vid47Thisandsuper {
    public static void main (String args[]){
one first = new one(4);
System.out.println(first.getx());
two second = new two(7);
System.out.println(second.getx());
    }
}
