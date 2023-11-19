import java.util.Scanner;
public class digit {
    public static void main (String [] args){

        //  int digit=0;
        //  for(int n=0;n<100;n++){
        //     digit=n/10 ;
        //     digit++;
        //     System.out.println(digit);
        //  }

        int n,count=0;
        System.out.println("write your value");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc);
        n=sc.nextInt();
        
        while(n>0){

        n=n/10;
        count++;

        }
        System.out.println("Enetr your integer value : " + count );


        }
    }
