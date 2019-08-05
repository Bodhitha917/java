class test{
int a,b;
test()
{
System.out.println("no parameters");
a=10;
b=20;
System.out.print(a);
System.out.print(b);
}
test(int x)
{
System.out.println("one parameters");
 a=x;
 b=x;
System.out.print(a);
System.out.print(b);
}
test(int x,int y)
{
System.out.println("two parameters");
 a=x;
 b=y;
System.out.print(a);
System.out.print(b);
}
}
class testprogram{
public static void main(String[] args){
test ob1=new test();
test ob2=new test(100);
test ob3=new test(1,2);
}
}