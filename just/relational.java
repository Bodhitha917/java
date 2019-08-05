/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
import java.util.Scanner;
public class relational {
    public  static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter a number");
       int a=sc.nextInt();
       System.out.print("enter a number");
       int b=sc.nextInt();
      System.out.print((a>b)&&(b>a ));
      System.out.println((a>b)||(b>a ) );
      
       
          
        
    }
    
}
