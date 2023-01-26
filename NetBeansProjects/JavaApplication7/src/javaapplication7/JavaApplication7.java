
package javaapplication7;

public class JavaApplication7 {

   
    public static void main(String[] args) {
        
           int S=0;
 
        for (int i=1; i<2; i=i+1)
        {
            if (i%2==1 )
            {
            System.out.print("S = " +S+ " + " +i+ " = " +(S+i)+ "\n");
            S = S + i;
            }
            else 
            {
                System.out.print("S = " +S+ " + " +i+ " = " +(S-i)+ "\n");
                S = S - i;
            }
            
        }
 
        System.out.print("\n");
 
    }
}
