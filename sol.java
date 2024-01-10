package practice;

import java.util.Random;
import java.util.Scanner;
 /*
     Create the class game, which allows a user to play" Guess the number" game once. game should have the following methods:
     1.Constructor to generatr the random number
     2. Takeuserinput() to take a user input of number
     3. isCorrectnumber() to detect whether the nmber entered by the user is true or not
     use properties such as noOfGuesses(int),etc get this task done
     4. getters and setters for no. of guesses.
    sol-> suppose comp selected random no. 43 (bw 0 to 50)
    user-49 //no. is too big
    40 //no. is small
    42 //no. is smaa
    45 //no. is big
    43 //no. is correct
    now print the score of the user 
     */
class game{
    public int number;
    public int noOfGuesses;
    public int inputnumber;

    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    void game(){
        Random comp = new Random();
        this.number=comp.nextInt(50);
    }
    void  takeuserinput(int n){
    System.out.println("Guess the number : ");
    Scanner user = new Scanner(System.in);
    System.out.println(user);
    inputnumber=user.nextInt(50);
 
    }
   
    boolean isCorrectnumber(){
        if(inputnumber==number){
            System.out.println("Your guess is correct.You win !!");
                return true;
        }
        else if(inputnumber<number){
            System.out.println("Your number is small.");
        }
        else if(inputnumber>number){
            System.out.println("Your number is large");
        }
        return false;
        
    }

}
public class vid43sol {
    public static void main(String[] args) {
      
     game g =new game();   
     g.takeuserinput(456);
     boolean b = g.isCorrectnumber();
    System.out.println(b);

    }
}






