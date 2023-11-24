
// 4.Write a java program to find out the day of the week given the number [1 for monday, 2 for tuesday....and so on]
Scanner sc=new Scanner(System.in);
System.out.println("Enter the day number of the week: " );
int day=sc.nextInt();
switch(day){
    case 1-> System.out.println("Today is monday");
    case 2-> System.out.println("Today is Tuesday");
    case 3-> System.out.println("Today is Wednesday");
    case 4-> System.out.println("Today is thursday");
    case 5-> System.out.println("Today is Friday");
    case 6-> System.out.println("Today is Saturday");
    case 7-> System.out.println("Today is Sunday");
                default->System.out.println("There are only 7 days in a week");

}
