/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
public class armstrong
{
    public  static void main(String[]args)
    {
      int sum=0,n=153,c,r;
      int temp=n;
      while(n>0)
      {
        r=n%10;
        c=r*r*r;
        sum=sum+c;
        n=n/10;
      }
      if(temp==sum)
       System.out.print("it is armstrong number");
      else
      System.out.print("it is not armstrong number"); 
    
   }
}