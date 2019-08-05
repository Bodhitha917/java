class geometry
{
int l,b;
float r;
double s,h;
void area(int x,int y){
l=x;
b=y;
System.out.println(l*b);
}
void area(float a)
{
r=a;
System.out.println(Math.PI*r*r);
}
void area(double a,double b)
{
s=a;
h=b;
System.out.println(0.5*s*h);
}
}
class testprogram{
public static void main(String[] args){
geometry obj=new geometry();
obj.area(1,2);
obj.area(1.2f);
obj.area(1,2);
}
}

