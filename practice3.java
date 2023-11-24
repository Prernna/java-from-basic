// 3. Calculate income tax paid by an employee to the government as per the slots mentioned below: (the amount of your income deducted by the percentage of tax)
// income slots    tax
// 2.5l-5.0l       5%
// 5l-10l          20%
// above 10l       30%
// note that there is no tax below 2.5l . take amount as an input from the user.


Scanner sc=new Scanner(System.in);
System.out.println(sc);
System.out.println("Enter your income : ");
float tax=0;
float income=sc.nextFloat();;
if(income<=2.5){
    tax=tax+0;
}
if(income>2.5 && income <=5){
    tax= tax + 0.05f * (income-2.5f);
}
else if (income>5f && income<=10f)
{
    tax=tax + 0.05f * (5.0f - 2.5f);
    tax = tax + 0.2f * (income-2.5f);
}
else if (income>10.0f){
tax=tax+0.05f * (5.0f-2.5f)+ 0.2f * (5.0f - 5f) + 0.3f * (income - 2.5f);
// tax=tax + 0.2f * (5.0f - 5f); 
// tax = tax + 0.3f * (income - 2.5f);
// the above 2 lines can also be written to calculate the tax to be paid.
}
System.out.println("total text paid by the employee is " 
+
 tax);
