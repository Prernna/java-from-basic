for(int i=0;i<8;i++){
             if(i==4){
                System.out.println("Loop ends here!");
                continue;
            }
             System.out.println(i);
            System.out.println("Loop is running");
          
        }
        
          int k=0;
        do{
            k++;
             if(k==2){
                System.out.println("Loop is ending");
                continue;
            }
            System.out.println(k);
            System.out.println("Loop is running");
           
            
        }while(k<7);
        System.out.println("Do-while loop ends here.");
