// 5.Write a program to find out the type of website from the url . .Com ->Commercial website , .Org-> organisation website , .In->Indian website

Scanner sc=new Scanner(Systen.in);
System.out.println("Write the type of website you want to search");
String url=sc.next();
switch (url) {
    case ".com":
    System.out.println("This is an Commercial Website.");
    break;
    case ".in":
    System.out.println("This is an Indian Website");
    case ".org":
    System.out.println("This is an Organisational Website");
    default:System.out.println("This is not a website");
        
}
// This can also be done as following using if else statements
System.out.println("Enter the website url you want to search");
String website = sc.next();
if(website.endsWith(".org")){
    System.out.println("This is an Organisational website");
}
else if(website.endsWith(".com")){
    System.out.println("This is an Commercial website");
}
else if(website.endsWith(".in")){
    System.out.println("This is an Indian website");
}
else{
    System.out.println("This is not a website");
}
