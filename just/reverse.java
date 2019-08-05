import java.util.Scanner;
class reverse{
public static void main(String[] args){
int i;
Scanner s1=new Scanner(System.in);
System.out.print("enter a string");
String a=s1.nextLine();
System.out.print(a.length());
for(i=a.length-1;i>=0;i--)
{
System.out.print(a);
}
}
}


