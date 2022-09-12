import java.util.Scanner;
public class zoo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        check(str);

        sc.close();
    }    

    public static void check (String str)
    { 
        int x = 0 , y = 0 ;

        char[] ch = new char[20];
        ch = str.toCharArray();

        for(int i=0 ; i<ch.length ; i++)
        {
           if(ch[i] == 'z')
           {
                x = x + 1;
           }
           
           else if(ch[i] == 'o')
           {
                y = y + 1;
           }
        }

        int ans = 2 * x;
        
        if(ans == y)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }

}
