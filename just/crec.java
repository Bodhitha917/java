/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
class rectangle
{
    int l,b;
    void area()
    {
      int a;
      a=l*b;
      System.out.print(a);
    }
    void peri()
    {
      int p;
      p=2*(l+b);
      System.out.print(p);
    }
    
}
class  rectangle1
{
    public static void main(String[]args)
    {
        rectangle ob1=new rectangle();
        ob1.l=10;
        ob1.b=20;
        ob1.area();
        ob1.peri();
   
        
    }
}