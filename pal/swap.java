/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Bodhita
 */
import java.util.Scanner;
public class swap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int num=sc.nextInt();
        System.out.print("enter a number");
        int num1=sc.nextInt();
        System.out.print("intial values :"+num+" and num1: "+num1);
        num=num+num1;
        num1=num-num1;
        num=num-num1;
         System.out.println("after values :"+num+" and num1: "+num1);
    }
    
}
