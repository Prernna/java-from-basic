import java.util.Scanner;
public class vid18{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age<6){
            System.out.println("Student can study upto 1st class.");   
        }
        else if(age<10){
System.out.println("Student can study upto class 5th.");

        }
else if( age<17){
    System.out.println("Study can study upto class 12th");
}
else{
    System.out.println("Student can study in College.");
}

// SWITCH CASE CONTROL INSTRUCTION
switch(age){
    case 17:
    System.out.println("next year u will be an adult");
    break;
    case 23:
    System.out.println("You will get married soon !!");
    break;
    case 28:
    System.out.println("Your earning is greater than you expected");
    break;
    default:
    System.out.println("Enjoy your life to the fullest.");
}

// ENHANCED CASE SWITCH

String var;
System.out.println("enter any name");
var=sc.next();
// here we are using enhanced switch cases because we will not require break statement in this case.
switch (var) {
    case "Divya" ->{
        System.out.println("Divya is a nickname of prerna");
        System.out.println("Her brothers name is kartik");
System.out.println("Her bestfriends name is sudhanshu");
    }
    case "Kartik"->{
        System.out.println("kartik is her brother and he is studying in class 11th currently.");
        System.out.println("He has opted for commerce");
    }
        case "Ayesha" ->
        {
System.out.println("this is her bestfriends favourite name");
        }

    default -> System.out.println("Your name is beautiful. Your name defines plenty of things about yourself.");
   
        
}
 
System.out.println("Thanks for being patient");




    }
}
