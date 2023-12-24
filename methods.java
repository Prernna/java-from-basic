public class methods {

//Basically , just focus on the syntax of methods other things will be understood soon by practicing.

static int logic(int x,int y){   // here, Static is a datatype
    int z;
    if(x>y){
        z=x+y;
    }else{
        z=(x+y)*5;
    }
    return z;
}

    public static void main (String args[]){

        //Method example
int a1=4;
int b1=8;
int c1 = logic(a1,b1); // logic here signifies the value of a1 and b1 will now be considered as x and y in method that is written above.

if(a1>b1){
    c1=a1+b1;
}
else{
c1 =(a1+b1)*5;
}
System.out.println(c1);


//Methods in java->(do not repeat yourself) simple representation of multiple functions in one go

//for ex a function
int a=4;
int b=6;
int c ;
if(a>b){
    c=a+b;
}
else{
c =(a+b)*5;
}
System.out.println(c);


// Method invocation using object creation. A method can be called by  creating an object of the class in which the method exists followed by the method call:
c1 = logic(a1,b1);
System.out.println(a1+ " " +b1);
int a2=4;
int b2=4;
int c2;
c2 = logic(a2,b2);
// methods object= new methods();
// c2 = object.logic(a2, b2);
System.out.println(c2);


    }
}
