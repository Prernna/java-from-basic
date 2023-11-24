// 6. Write a java program to find whether a year entered by the user is a leap year or not.

Scanner sc=new Scanner(System.in);
system.out.println(sc);
System.out.println("Enter the year you want to check : ");
int year=sc.nextInt();
if(year%4==0){
    System.out.println("This is a leap year");
}
else{
    System.out.println("This is not a leap year");
}
