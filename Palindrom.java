import java.util.Scanner;
public class Palindrom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String st = sc.next();
        System.out.print(Pallendrom(st));
        sc.close();
    }

    public static String Pallendrom (String str)
    {
        if(str.length() <= 1)
        {
            return "YES";
        }

        String ans = Pallendrom(str.substring(1,str.length()-1));

        if(str.charAt(0) != str.charAt(str.length()-1))
        {
            return "NO";
        }
        return ans;

    }
}
