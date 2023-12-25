public class vid32methods {
//Method overloading
static void nothing(){
    System.out.println("Nothingness");
}
static void change(int a){
    a=74;
}
static void change2(int[] arr){
    arr[2]=77;
}
static void foo(){
    System.out.println("Kartik have not brushed his teeth!");
}
static void foo(int a){
    System.out.println("I am going to miss you "+a+" times");
}
static void foo(int a,int b){
    System.out.println("whats your age "+a+" and class "+b);
}
    public static void main(String[] args) {
        
nothing(); //runs the above statement of static void

// int[] arr={88,59,47,69,98,90};
//Case 1: Changing the integer (these are very important topics )
// int b=47;
// change(b);
// System.out.println("change is "+ b); //integer did not change

//NOTE: In case of arrays , the reference is passed . same is the case for object passing to methods.

//Case 2: Changing the array(arr)
int[] marks={88,59,47,69,98,90};
change2(marks);
System.out.println("The value of arr now becomes : "+marks[2]);

//METHOD OVERLOADING : Two or more methods can have same name but different parameters. such methods are called overloaded methods
// void foo()
// void foo(int a)
// void foo(int a , int b)

foo();
foo(3000);
foo(17, 12);
// Arguments are actual value!!
// method overloading cannot be performed by changing the return type of methds . ex:void changes to int cannot be written two times it will give an array but if we change its identities it may not show error.

    }
}
