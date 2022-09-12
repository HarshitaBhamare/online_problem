import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(Fact(x));

        sc.close();
    }

    public static int Fact(int x)
    {
        if(x <= 1)
        {
            return 1;
        }

        return x * Fact(x-1);
    }
}
