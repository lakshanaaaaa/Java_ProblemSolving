import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int r=0;
        for(int i=0;i<n;i++)
            r=r^a[i];
        System.out.print(r);
    }
}