public class vid24{
    public static void main (String [] args){
        // break and continue using loops
        
        for(int i=0;i<8;i++){
            System.out.println(i);
            System.out.println("Loop is running");
            if(i==4){
                System.out.println("Loop ends here!");
                break;
            }
        }
        
        int j=0;
        while(j<4){
            System.out.println("Loop is running");
            if(j==2){
                System.out.println("Loop is ending");
                break;
            }
            j++;
        }
        
         int k=0;
        do{
            System.out.println(k);
            System.out.println("Loop is running");
            if(k==2){
                System.out.println("Loop is ending");
                break;
            }
            k++;
        }while(k<7);
        System.out.println("Do-while loop ends here.");
        
        
        
        
    }
}
