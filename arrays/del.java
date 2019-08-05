import java.util.Scanner;

class del

{

    public static void main(String[] args) 

    {

        int n, pos, x,j,i;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");

        for( i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }

        System.out.print("Enter the element you want to delete:");

        x = s.nextInt();

       for (i=0;i<=n;i++)
       {
         if(x==a[i])
        {
         for( j=i;j<=n;j++)
        {
          a[j]=a[j+1];
        }
        }
         } 

        System.out.print("After deleting:");

        for( i = 0; i <= n; i++)

        {

            System.out.print(+a[i]);

        }

        System.out.print(a[n]);

    }
}