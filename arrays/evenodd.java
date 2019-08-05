 import java.util.Scanner;

    class  evenfh

    {

        public static void main(String[] argsane) 

        {

            int n;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter no. of elements you want in array");

            n = s.nextInt();

            int a[] = new int[n];

            System.out.println("Enter all the elements:");

            for (int i = 0; i < n; i++) 

            {

                a[i] = s.nextInt();

            }
   for(int i=0;i<n;i++)
{
if (a[i]%2==0)
System.out.print("even number");
else
System.out.print("odd number");
}
}
}