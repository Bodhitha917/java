class test{
int a;
test()
{
a=100;
System.out.print(a);
}
void display(int a)
{
this.a=50;
System.out.print(a);
}
}
class testpro
{
public static void main(String[]  args){
test ob=new test();
ob.display(10);
}
}
