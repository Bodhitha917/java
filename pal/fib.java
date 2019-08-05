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
public class strong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         System.out.print("enter a number");
        int m=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(b);
        for(int i=3;i<=m;i++)
        {
        int  c=a+b;
        System.out.print(c);
        a=b;
         b=c;
        }   
    }
    
}
