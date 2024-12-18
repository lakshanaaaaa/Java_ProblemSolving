import java.util.*;
class HelloWorld
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        char[] c1= a.toCharArray();
        char[] c2= b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(Arrays.equals(c1,c2))
            System.out.print("True");
        else
            System.out.printf("False");
    }
}