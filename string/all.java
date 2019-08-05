class upper{
public static void main(String[] args){
String s1=new String("hello");
String s2=s1.toUpperCase();
System.out.print(s2);
String s3=s1.toLowerCase();
System.out.print(s3);
String s4=s1.replace("hello","hai");
System.out.print(s4);
String s5=s1.replaceFirst("hello","hai");
System.out.print(s5);
int s6=s1.indexOf('h');
System.out.print(s6);
String s7=s1.substring(2,4);
System.out.print(s7);
boolean s8=s1.startsWith("he");
System.out.print(s8);
boolean s9=s1.endsWith("lo");
System.out.print(s9);
}
}