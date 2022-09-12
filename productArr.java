import java.util.Scanner;
public class productArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];

        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextLong(); 
        }

        System.out.println(pro(arr));
        sc.close();
    }

    public static long pro(long [] arr)
    {
        long p=1;
        for(int i=1 ; i<=arr.length ; i++)
        {         
            p = (p * arr[i-1])% 1000000007 ;
        }
        return p;       
    }
    
}