import java.util.Scanner;
class binary{
public static void main(String [] args){
int i,s,f,l;
Scanner sc=new Scanner(System.in);
System.out.print("enter a number");
int a=sc.nextInt();
int b[]=new int[a];
f=0;
l=a-1;
for(i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
for(i=0;i<a;i++)
{
System.out.print(b[i]+ ",");
}
System.out.print("enter a number");
int x=sc.nextInt();
for(i=0;i<a;i++)
{
s=(f+l)/2;
if(x==b[s])
{
System.out.print("element found");
break;
}
if(x>b[s])
{
f=s+1;
}
else 
{
l=s-1;
}
}
if(i==a)
System.out.print("element not found");
}
}

