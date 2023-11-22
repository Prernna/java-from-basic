import java.util.Scanner;
public class vid16 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(sc);
        System.out.print("Enter your age number : ");
        int age=sc.nextInt();
 
 if(age>18){
    System.out.println("you can get married");
 }
 else{
    System.out.println("You need to grow-up");
 }
 if(age!=21){
    System.out.println("You are a boy , you need to grow up");
 }

    }
}
