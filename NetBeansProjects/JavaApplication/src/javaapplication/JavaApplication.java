
package javaapplication;


public class JavaApplication {

    
    public static void main(String[] args) {
       double s=0;
       double i=1;
       System.out.print("methode with while \n");
       
       while (i<=100)
       {
     s=s+(1/i);
     i=i+1;
       }
        System.out.print("the mult between 1 to 10 = " + s + "\n");
        System.out.print("-----------\n");
  
        System.out.print("methode with do while \n");  
        s=0;
        i=1;
        
        do
        {
            s=s+(1/i);
            i=i+1;
        }
           while (i<=100) ;
        System.out.print("the mult between 1 to 10 = " + s + "\n");
        System.out.print("-----------\n");
        
        System.out.print("methode with for \n");
        i=1;
        s=0;
        
        for(i=1;i<=100;i=i+1)
        {
            s=s+(1/i);
        }
        System.out.print("the mult between 1 to 10 = " + s + "\n");
        }
    }

