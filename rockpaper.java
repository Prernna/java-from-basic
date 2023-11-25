import java.util.Scanner;
import java.util.Random;
public class vid20 {
    public static void main(String[] args) {
        
System.out.println("Enter your choice between rock , paper and scissor !!");
Scanner sc=new Scanner(System.in);
Random any= new Random();

System.out.println(sc);
int comp=any.nextInt(1,4); // it will choose any random no. from 1 to 3.
System.out.println("Computer have chose between rock,paper and scissor : ");
System.out.println("1 ->Rock \n2 ->Paper \n3 ->Scissor");
System.out.println("Enter the number between 1 to 3 : ");
int user=sc.nextInt();
System.out.println("Computer picked : "+comp);
System.out.println("Results are...");

if(user>=4){
    System.out.println("you can only enter number 1,2 or 3.");
}
if(user==1 && comp==3){
    System.out.println("User wins as rock beats Scissor");
}
else if(user==2 && comp==1){
    System.out.println("user wins as paper wraps rock");
}
else if(user==3 && comp==2){
    System.out.println("User wins as scissor cuts paper");
}
else if(user==comp){
    System.out.println("Draw!!! Restart the match to find the winner");
}
else{
    System.out.println("Computer beats user");
}
    }
}
