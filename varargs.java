public class varArgs {
// //ex of overloading func later we will see how to solve this problem
// static int sum(int a,int b){
//     return a+b;
// }
// static int sum(int a,int b,int c){
//     return a+b+c;
// }
// static int sum(int a,int b,int c, int d){
//     return a+b+c+d;
// }

//we will write a short method to take as many input as user wants 
static int sum(int ...arr){
//Available as int [] arr;
int result=0;
for(int a: arr){
    result += a;
}
return result;
}
//We can also create a function bar like this

// public static void bar(int a,int array){ //Atleast one integer is required


    public static void main(String args[]){

//VarArgs- Variable Arguements
System.out.println("Sum is : "+ sum( ));//it will print 0. if we pass a integer x in static method then this line will produce an error ar this needs to be executed atleast for once.

System.out.println("Sum of 5 and 9 is : "+ sum(5,9 ));
System.out.println("Sum of 4,5 and 9 is : "+ sum(4, 5, 9));
System.out.println("Sum of 3,4,5 and 9 is : "+ sum(3, 4, 5, 9));
System.out.println("Sum of 3,4,5,9 and 10 is : "+ sum(3, 4, 5, 9,10));

    }
}
