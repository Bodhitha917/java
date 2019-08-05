import java.util.*;
class random{
public static void main(String[] args){
int i;
Random ob=new Random(100);
System.out.println(ob.nextInt());
Random ob1=new Random(100);
System.out.println(ob.nextFloat());
Random ob2=new Random(100);
System.out.println(ob.nextDouble());
Random ob3=new Random();
System.out.println(ob3.nextInt(20));
Random ob4=new Random(500);
Random ob5=new Random(500);
int a=ob4.nextInt(500);
int b=ob5.nextInt(500);
System.out.println(a);
System.out.println(b);
for(i=a; i<=b; i++)
{
System.out.print(i);
}
}
}
