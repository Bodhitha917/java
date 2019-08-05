import java.util.Scanner;
import java.Arrays;


class sort

{

    public static void main(String[] args) 

    {

        int n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }
      for(int i = 0; i < n; i++)

        {

            System.out.print(a[i]+",");

        }
       
       Arrays.sort(a);
     for(int i = 0; i < n; i++)

        {

            System.out.print(a[i]+",");

        }
     
    }
}