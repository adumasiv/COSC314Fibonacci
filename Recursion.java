import java.util.*;

public class Recursion 
{
    public static int rec(int n)
    {
        if (n<=1)
            return n;
        return rec(n-1) + rec(n-2);

    }

    public static void main (String [] args)
    {
        int ans;
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        ans = kbd.nextInt();
        System.out.println(rec(ans));
        kbd.close();
    }
}