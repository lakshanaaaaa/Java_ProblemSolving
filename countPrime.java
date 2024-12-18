import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        boolean a[]=new boolean[n];
        Arrays.fill(a,true);
        a[0]=false;
        a[1]=false;
        for(int i=2;i*i<n;i++)
        {
            if(a[i])
            {
                for(int j=i*i;j<n;j=j+i)
                {
                    a[j]=false;
                }
            }
        }
        for(int i=2;i,n;i++){
            if(a[i])
            c++;
        }
        System.out.print(c);
    }
}