/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
public class nestedif { 
    public static void main(String[] nestedif){
        int a=10,b=20,c=30;
        if(a>b)
        {
          if(a>c)  
          {
              System.out.print(+a);
          }
        }
         if(b>a)
        {
          if(b>c)  
          {
              System.out.print(+b);
          }
        }
          if(c>b)
        {
          if(c>a)  
          {
              System.out.print(+c);
          }
        }
        
         else
          {
              System.out.print("invalid");
          }
    }
    
}
