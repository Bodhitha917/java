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
public class ifelse {
    public static void main(String[]ifelse){
         Scanner sc=new Scanner(System.in);
         System.out.print("enter a number");
         int a=sc.nextInt();
         System.out.print("enter a number");
         int b=sc.nextInt();
         System.out.print("enter a number");
         int c=sc.nextInt();
         if(a>b&&a>c){
             System.out.print(+a);
         }
          if(b>a&&b>c){
             System.out.print(+b);
         }
          if(c>a&&c>b){
             System.out.print(+c);
          }
    }
}
