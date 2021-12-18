import java.util.*;

public class Iteration
{
    public static int iter(int n)
    {
        if(n <= 1)
            return n;

        int prev = 0, curr = 1;
        for (int i = 0; i < n - 1; i++)
        {
            int next = prev + curr;
            prev = curr; 
            curr = next;
        }
        return curr;
    }

    public static void main(String [] args)
    {
        int ans;
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        ans = kbd.nextInt();
        System.out.println(iter(ans));
        kbd.close();
    }
}