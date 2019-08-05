class test5
{
private int a;
test5()
{
a=10;
}
int display4()
{
return a;
}
}
class priv{
public static void main(String[] args){
test5 ob=new test5();
System.out.print(ob.display4());
}
}
