public class array3{
    public static void main(String[] args){

// array of array is called 2d array
//multidimensional array-> array which have multiple arrays inside it is called multidimensional arrays.

/*
 int [] marks; 1-D array
 */

 int [][] flats =new int[2][3]; //a 2-D array. here lets understand this as it has two rows and three coloumns.

 flats[0][0]=101;
 flats[0][1]=102;
 flats[0][2]=103;
 flats[1][0]=201;
 flats[1][1]=202;
 flats[1][2]=203;

 //Displaying a 2-d array using for-loop
System.out.println("The nuber on rooms in each floor are as follows : ");
 for(int i=0;i<flats.length;i++){
    for(int j=0;j<flats[i].length;j++){
        System.out.print(flats[i][j]);
System.out.print(" ");

    }
    System.out.println(" ");
 }

    }
}
