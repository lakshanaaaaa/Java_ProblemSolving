import java.util.*;
public class Main
{
    public static String integerToRoman(int num)
    {
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String r[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String roman="";
        for(int i=0;i<val.length && num>0 ;i++)
        {
            while(num>=val[i])
            {
                num=num-val[i];
                roman=roman+r[i];
            }
        }
        return roman;
    }
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(integerToRoman(n));
    }
}