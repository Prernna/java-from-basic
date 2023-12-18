public class vid26{
    public static void main (String [] args){
        
        /*ARRAYS- it is basically a collection of similar types of data
        Classroom of 500 students - you have to store marks of these 500 students
        you have two options:
        1. Create 500 variables
        2. Use arrays (recommended) */
        
        //There are 3 ways to create an array in java
        //1.declaration and memory allocoation
        int[] marks= new int[5]; // here 'new int' is used to initialize a new storage of an integer in the arrays
        
        //2.declaration and then memory allocation 
        //int [] marks;   marks=new int[5];
        
        marks[0]=70;
        marks[1]=80;
        marks[2]=40;
        marks[3]=90;
        marks[4]=80;
        System.out.println("\n");
        
        int sum=marks[1] + marks[2] + marks[4];
        System.out.println(sum);
        System.out.println(marks[3]);
        
                System.out.println("\n");
        //3..Declaration,memory allocation and initialization together.
        int[] wieght = {45,35,60,56,70};
        System.out.println(wieght[3]);
        
        //arrays has asize from 0 to (n-1) where n is the size of array.
        
        
    
    }
}
