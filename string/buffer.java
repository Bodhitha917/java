class buffer{
public static void main(String[] args){
StringBuffer ob1=new StringBuffer("hello");
System.out.println(ob1.length());
System.out.println(ob1.append("bodhitha"));
System.out.println(ob1.reverse());
System.out.println(ob1.insert(2,"hai"));
System.out.println(ob1.replace(2,6,"hai"));
System.out.println(ob1.delete(2,4));
System.out.println(ob1.substring(2));
System.out.println(ob1.substring(1,4));
System.out.print(ob1.capacity());
}
}


