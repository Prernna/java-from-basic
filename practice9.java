//4.write a program to print multiplication table of 10 in reverse order
        
        int a=10;
        
        System.out.println("The table in reverse order is as follows :\n");

        for(int i=a;i!=0;i--){
            System.out.printf("%d X %d = %d\n",a,i,a*i);
        }

//5. Write a program to find factorial of a given number using for loops.
        
       
        int  n =6;
        int i= 1;
       int factorial=1;
        while(i<=n)
        {
              factorial *= i;
        i++;
        }
        System.out.println(factorial + " is factorial of your given number.");
