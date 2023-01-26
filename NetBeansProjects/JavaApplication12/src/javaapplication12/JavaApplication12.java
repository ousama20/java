
package javaapplication12;

import java.util.Scanner ;

public class JavaApplication12 {

  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int i;
        int s;
        int n;
        
        System.out.print("give us a number please = ");
        n=input.nextInt();
        
        s=0;
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
            System.out.print("the multiple frome 1 to "+n+" = "+s+"\n");
            
            
        }
       
    }
    

