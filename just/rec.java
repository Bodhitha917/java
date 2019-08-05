/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
class rec
{
    int l,b;
    void display(int x,int y)
    {
        int a,p;
        l=x;
        b=y;
        a=l*b;
        p=2*(a+b);
        System.out.print(a);
         System.out.print(p);
    }
}
class rec2{
public static void main(String[] args)
{
    rec ob1=new rec();
int a=10,p=19;
ob1.display(a,p);
}
}