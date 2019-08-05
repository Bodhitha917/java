class str3{
public static void main(String[]args){
String s1="hello";
System.out.print(s1);
String s2=new String();
s2="hello";
System.out.print(s2);
String s3=new String("hello");
System.out.print(s3);
char str[]={'h','e','l','l','o'};
String s4=new String(str);
System.out.print(s4);
String s6=new String(str,1,3);
System.out.print(s6);
}
}
