
package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

   
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        String name;
        String job;
        int age;
        
        System.out.print(" please give me your Name = ");
        name=input.nextLine();
       
        System.out.print(" please give me your job = ");
        job=input.nextLine();
        
        System.out.print(" please give me your age = ");
        age=input.nextInt();
        
        System.out.print("!!!-------User Information--------!!! \n ");
        System.out.print("User Name = " +name+"\n");
        System.out.print("User Job = " +job+"\n");
        System.out.print("User Age = " +age+"\n");
        
        
        
       
    }
    
}
