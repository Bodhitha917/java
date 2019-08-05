class object{
int a,b,c;
object(object i)
{
a=i.a;
b=i.b;
c=i.c;
}
object(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
int product()
{
return  a*b*c;
}
}
class passmain{
public static void main(String[] args){
object s=new object(10,20,30);
object r=new object(s);
int pro;
pro=s.product();
System.out.print(pro);
pro=r.product();
System.out.print(pro);
}
}
