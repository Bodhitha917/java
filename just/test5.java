class test{
static int a;
static void print()
{
a=50;
System.out.print(a);
}
public static void main(String[] args)
{
test ob=new test();
a=20;
System.out.print(a);
//ob.display();
print();
}
}

