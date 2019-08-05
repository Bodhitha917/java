/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
public class strongnum {
    public static void main(String[]args){
        int n=145,r,fact,sum=0,i;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            fact=1;
            for(i=r;i>=1;i--)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
       
        if(temp==sum)
            System.out.print("strong number");
        else
         System.out.print(" its not strong number");   
    }
    
}
