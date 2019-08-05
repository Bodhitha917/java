public class array2{
public static void main(String[] args){
int sum=0;
int b[]={1,2,3,4,5,6};
int n=b.length;
System.out.print(n);
System.out.print(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
System.out.println(b[4]);
System.out.println(b[5]);
        for(int x:b){
            sum+=x;
           }
        System.out.print(sum);

}
}