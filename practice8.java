//3. Write a program to print multiplication table of a given number n.
        
        int a;
        a=5;
        for(int i = 1;i<=10;i++){
            System.out.println(i*a);
        }
        
               System.out.println("\n");
               //Write the table in decrementing order 
               int c;
               c=5;
               for(int j=10;j>=1;j--){
                System.out.printf("%d x %d = %d\n",c,j,c*j);

               }
               
                 System.out.println("\n");


        int b;
        b=1;
        while(b<11){
            System.out.println(b*4);
            b++;
        }
       System.out.println("\n");
        do{
            System.out.println(a*3);
            a++;
        }
        while(11>a && a>1);
