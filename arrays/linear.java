import java.util.Scanner;
class linear{
public static void main(String [] args){
int i;
Scanner sc=new Scanner(System.in);
System.out.print("enter a number");
int a=sc.nextInt();
int b[]=new int[a];
for(i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
for(i=0;i<a;i++)
System.out.print(b[i]+ ",");
System.out.print("enter a number");
int x=sc.nextInt();
for(i=0;i<a;i++)
{
if(b[i]==x)
{
System.out.print("element found");
break;
}
else if(i==a-1)
{
System.out.print("element not found");
}
}
}
}