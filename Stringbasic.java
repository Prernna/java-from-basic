import java.util.Scanner;

public class vid13 {
    public static void main(String [] srgs){

        // String is basically a class used as an primitive data type. Strings are immutable and cannot be changed.

        String name="Prerna ";
        String naam=new String("Divya");
        System.out.println(name);
        System.out.println(naam);
        String id;
        id=new String("Kartik singh");
        System.out.println(id);

        int a=9;
        float b =4.7f;
        System.out.printf("The value of a is %d and the value of b is %f ",a,b);
        System.out.format("The value of a is %d and the value of b is %f ",a,b);

        // here %d is used for int
        // %f is used for float
        // %c is used for char
        // %s is used for String

        System.out.println("Write your name");

        Scanner pk=new Scanner(System.in);
        String she = pk.nextLine();
       
        System.out.println(she);
        System.out.println(pk);

    }
}
