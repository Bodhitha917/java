/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
public class NewClass2 {
    public static void main(String[]args){
        int a=6,b=4,c=1;
        while(c!=0)
        {
        c=a%b;   
        a=b;
        b=c;
  
        }
        if(b==1)
        {
          System.out.print("it is   co prime");
        }
        else
        {
           System.out.print("it is  notco prime");  
        }
             
    }
    
}
