
package javaapplication10;


public class JavaApplication10 {

    
    public static void main(String[] args) {
        System.out.print(" *  \n");
        for (int i=1;i<=6;i++)
        {
            System.out.print(" * ");
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(" - ");
            }
            System.out.print(" * \n");
        }
        for(int j=1;j<=8;j++)
        {
            System.out.print(" * ");
        }
       

       
    }
    
}
