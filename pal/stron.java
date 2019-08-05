/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
public class stron {
    public static void main(String[]args){
       int sum=0,n,a=121,b;
       n=a;
       while(n!=0)
       {
         b=n%10;
         sum=sum*10+b;
         n=n/10;
        }
       if(sum==a)
       {
           System.out.print("palindrome");
       }
       else
       {
           System.out.print("it is not palindrome");
       }
}
}
