import java.util.Scanner;
class employee{
String ename;
double salary;
String dname;
String eid;
void output()
{
System.out.print("\n"+ename);
System.out.print("\n"+salary);
System.out.print("\n"+dname);
System.out.print("\n"+eid);
}
void input()
{
System.out.print("enter employee name");
Scanner sc=new Scanner(System.in);
ename=sc.nextLine();
System.out.print("enter employee salary");
Scanner sd=new Scanner(System.in);
salary=sd.nextDouble();
System.out.print("enter department");
Scanner se=new Scanner(System.in);
dname=se.nextLine();
System.out.print("enter employee id");
Scanner sf=new Scanner(System.in);
eid=sf.next();
}
}
class test6{
public static void main(String[] args){
employee ob=new employee();
ob.input();
ob.output();

}
}