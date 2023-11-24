2. Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

Scanner sc=new Scanner(System.in);
System.out.println(sc);


 System.out.println("Enter your marks  : ");
int english=sc.nextInt();
int maths=sc.nextInt();
int science=sc.nextInt();
float total= (english + maths + science )*100f/300f;
System.out.println(total+"%");
if(total>=40 && english>=33 && maths>=33 && science>=33){
System.out.println("total marks contains required percentage. Hence you are promoted.");
}
else if(total==33)
{
System.out.println("You are just passed with 33%");
}
else{
    System.out.println("your marks are not good enough");
}
