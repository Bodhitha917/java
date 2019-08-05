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
class rollmobile
{ 
    int r,m;
    void display()
    {
       
        System.out.print(r);
    }
    void display1()
    {
        System.out.print(m);
    }
}
class mobile
{
    public static void main(String[]args)
    {
        rollmobile ob=new rollmobile();
        Scanner sc=new Scanner(System.in);
         System.out.print("enter roll number");
        int r=sc.nextInt();
        Scanner sd=new Scanner(System.in);
        System.out.print("enter phone number");
        int m=sd.nextInt();
        ob.display();
        ob.display1();
        return ;
    }
}