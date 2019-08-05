class test
{
int a;
test()
{
a=10;
System.out.print(a);
}
void display(test ob)
{
System.out.print(ob.a);
a=ob.a;
System.out.print(a);
}
}
class testprog
{
public static void main(String[] args){
test ob=new test();
ob.a=80;
test ob1=new test();
ob1.display(ob);
}
}