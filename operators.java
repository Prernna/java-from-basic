package dsacourse;

public class operators {
    public static void main(String[] args) {
        /*Arithmetic operators -> 
        Binary -> +,-,*,/,%
        Uniray -> ++(increment by one),--(Decrement by one)
        Pre increment ++a      Post increment a++ 
        1. change value        1.use value
        2. use value           2.change value
        Pre decrement --a       Post decrement a--
        1. value change         1.value assign
        2. value assign         2.value change
         */

         int a=5;
         int b=0;
        //  b=a++; //Post increment
        //  b=++a; //Pre increment
        // b=--a;
        b=a--;
         System.out.println(a);
         System.out.println(b);

         System.out.println("\n");
/*Relational operators
 * == equal to(returns boolean value)
 * != not equal to (also returns boolean value)
 * > , >= greater or greater equal to
 * < , <= smaller or smaller equal to
 */

/*Logical operators
 * && Logical AND
 * || Logical OR
 * !  Logical NOT //it will reverse thw output . if output is true it will give false
 */

int c = 10;
if(a>b && b<c){
    System.out.println("true");
}
 else if(a>b || b>c){
    System.out.println("True");
}
else if(! (a>b )){
    System.out.println("Not operator is showing false");
}
else{
    System.out.println("use any logical operator");
}

/*Binary(2->0,1) number system(base 2)
 * 4 to binary == 100
 * octal (base 8)
 * hexa decimal (base 16)
 */

 /*Bitwise Operators -> true=1,false=0
 & (Binary AND)
 | (Binary OR)
 ^ (Binary XOR) -> (if 0 1 and 1 0 is there it will return otherwise 0)
 ~ (Binary ONE's complement)
 << (Binary left shift)
 >> (Binary Right shift)
*/

/*Assignment operatrors
 = equal
 += -> ex: a=5;b=4;   a +=b -> a = a+b =>5+4 ,a=9
 -=
 *=
 /=
 */

    }
}
