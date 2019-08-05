/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
class exam
{
    int a;
    void display()
    {
       
        System.out.print(a);
    }
}
class tre
{
    public static void main(String[]args)
    {
        exam ob=new exam();
         ob.a=20;
        ob.display();
    }
}