import java.util.*;
public class abcd 
{
    public static void main(String [] args)
    {
    Scanner sc= new Scanner(System.in);
    String s = sc.nextLine(); 
    System.out.println(s);
    String[] pk={"prerna ","wants","to ","have","Butterscotch icecream","in a cup"};
    System.out.println(sc);
    for(int i=0; i<pk.length; i++){
    System.out.println(pk);
        System.out.println(pk[i]);
    }
    // System.out.println(pk[0]);
    // System.out.println(pk[1]);
    // System.out.println(pk[2]);
    // System.out.println(pk[3]);

    System.out.println(pk.length+" is length of string array");
    if(s.contains("_"))
    {
        s = sc.nextLine();
    }  
    else{
        System.out.println("Distance doesn't matter when two people are in love.");
    }
    // System.out.print(s);
     }

}
