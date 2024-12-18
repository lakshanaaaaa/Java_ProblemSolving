import java.util.*;
public class Main 
{
    public static Stack<Character> stacks(String str) 
    {
        Stack<Character> stack=new Stack<>();
        for (char ch:str.toCharArray()) 
        {
            if (ch=='#') 
            {
                if (!stack.isEmpty())
                    stack.pop();
            } 
            else 
                stack.push(ch);
        }
        return stack;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        if (stacks(a).equals(stacks(b))) 
            System.out.println("True");
        else 
            System.out.println("False");
    }
    
}
