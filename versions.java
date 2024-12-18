import java.util.*;
class HelloWorld
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String v1=s.next();
        String v2=s.next();
        char[] c1= v1.toCharArray();
        char[] c2= v2.toCharArray();
        if(c1[0]>c2[0])
        System.out.printf("downgraded");
        else if(c1[0]<c2[0])
        System.out.printf("upgraded");
        else
        {
            if(c1[2]>c2[2])
            System.out.printf("downgraded");
            else if(c1[2]<c2[2])
            System.out.printf("upgraded");
            else
            {
                if(c1[4]>c2[4])
                System.out.printf("downgraded");
                else if(c1[4]<c2[4])
                System.out.printf("upgraded");
                else
                System.out.printf("not changed");
            }
        }
    }
}