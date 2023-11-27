// import java.util.Scanner;

// public class arrays {
//     public static void main(String[] args ) {
//         Scanner sc = new Scanner(System.in);
//         int arr[]= new int[5];
//         System.out.println("Enter Input");
//         for(int i=0; i<5;i++){
//                 arr[i]= sc.nextInt();
//         }
//         int ar[]={1,3,5};
//         System.out.println("Here's your array PRerna!!");
//         for(int j=0;j<ar.length;j++){
//                 System.out.println(ar[j]*2);
//         }
       
//     }
// }




















// import java.util.*;

// public class arrays{
//     public static void main(String[] args){
//         Scanner pk = new Scanner(System.in);
//         System.out.println("enter the size  of your input");
//         int k = pk.nextInt();
//         int arr[]=new int[k];
//         for(int i=0;i<k;i++){
//                 arr[i] = pk.nextInt();
//         }
//         for(int j=0; j<arr.length;j++){
//             System.out.println(arr[j]);
//         }
       
//         }
// }







import java.util.*;
public class arrays{
    public static void main(String [] args){
        Scanner dsr= new Scanner(System.in);
        System.out.println("Enter your integer value :");
        int k = dsr.nextInt();
        int arr[]= new int[k];
        
        System.out.println(dsr);
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            arr[i] =dsr.nextInt();
        }       
        System.out.println("Enter your next integer value :");
        int l = dsr.nextInt();
        int ar[]= new int[l];
        System.out.println(ar.length); 
        for(int j=0;j<ar.length;j++){
            ar[j]=dsr.nextInt();
           
        }
 
        System.out.println("Enter your float value :");
        // float s = dsr.nextFloat();
        float[] array= new float[10];
        System.out.println(array.length);
        for(int d=0;d<array.length;d++){
            array[d]=dsr.nextFloat();
        }


    }
}
