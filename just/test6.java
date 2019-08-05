class test{
static int a=10;
static int b;
static void print()
{
System.out.print(a);
System.out.print(b);
}
static
 {
System.out.print("static......");
b=a*20;
}
public static void main(String[] arsg)
{
//test ob=new test();//
System.out.print("main");
print();
}
}