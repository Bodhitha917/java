import java.util.*;
class token{
public static void main(String[] args){
StringTokenizer s1=new StringTokenizer("hello world");
System.out.println(s1.countTokens());
System.out.println(s1.nextToken());
System.out.print(s1.nextToken());
}
}