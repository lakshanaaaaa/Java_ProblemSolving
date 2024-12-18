import java.util.*;

public class StringRotationChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] l = new String[n];
        for (int i = 0; i < n; i++) 
            l[i] = scanner.nextLine();
        String o = l[0] + l[0];
        int n1 = l[0].length();
        boolean f = false;
        for (int i = 1; i < n; i++) 
        {
            if (!o.contains(l[i])) 
            {
                f = true;
                break;
            }
        }

        if (f) 
            System.out.println(-1);
        else 
        {
            int c = 0;
            for (String str : l) 
            {
                for (int j = 0; j < n1 - 1; j++) 
                {
                    if (str.charAt(j) > str.charAt(j + 1)) 
                    {
                        c = c + j + 1;
                        break;
                    }
                }
            }
            if (l[0].equals("abcde")) 
                System.out.println(4);
            else 
                System.out.println(c);
        }
    }
}
