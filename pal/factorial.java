/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 *
 */
import java.util.Scanner;
public class factorial { 
    public static void main(String[]args){
        int i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enetr number");
        int num=sc.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
      System.out.print(fact);  
        
    }
    
}
