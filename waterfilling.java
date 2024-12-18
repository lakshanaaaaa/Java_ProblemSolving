import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int l=0;
        int m=n-1;
        int a=a[l];
        int b=a[m];
        int c=0;
        while(l<m)
        {
            if(a<b)
            {
                l++;
                a=Math.max(a,arr[l]);
                c=c+(a-arr[l]);
            }
            else
            {
                m--;
                b=Math.max(a,arr[m];
                c=c+(b-arr[h]));
            }
        }
        System.out.printf(c);
    }
}