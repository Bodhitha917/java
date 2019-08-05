class test{
test()
{
System.out.print("constructor");
}
void display()
{
System.out.print("hello");
}
void print()
{
System.out.print("hai");
}
}

class testprogram
{
public static void main(String[] args){
test ob=new test();
System.out.print(ob);
ob.display();
ob.print();
test ob1=new test();
System.out.print(ob1);
}
}