/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
class example
{
    int a;
    void display()
    {
        a=10;
        System.out.print(a);
        
    }
           
}
class test
{
    public static void main(String[]args){
        example ob=new example();
        ob.display();
        ob.a=30;
        System.out.print(ob.a);
        ob.display();
        
    }
}
