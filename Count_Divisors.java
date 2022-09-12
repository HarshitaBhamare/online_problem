import java.util.Scanner;
public class Count_Divisors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(count(l, r, k));

        sc.close();
    }    

    public static int count(int l , int r , int k)
    {
        int ans = 0;

        for(int i=l ; i<=r ; i++)
        {
            if(i%k == 0)
            {
                ans++;
            }
        }
        return ans;
    }

}
