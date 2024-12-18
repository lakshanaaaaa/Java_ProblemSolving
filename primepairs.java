import java.util.*;
public class PrimePairs 
{
    public static boolean isPrime(int number) 
    {
        if (number <= 1) 
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) 
        {
            for (int j = i; j <= n; j++) 
            {
                if (isPrime(i + j)) 
                    count++;
            }
        }
        if (n == 1) 
            System.out.println(0);
        else 
            System.out.println(count);
    }
}
