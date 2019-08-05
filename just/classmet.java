class student
{
int rno;
String s1;
void read()
{
rno=38;
s1="bodhitha";
}
void display()
{
System.out.print(rno);
System.out.print(s1);
}
}
class tesd
{
public static void main(String[] args)
{
student ob1=new student();
ob1.read();
ob1.display();
student ob2=new student();
ob2.rno=2;
ob2.s1="sivani";
ob2.display();
}
}
