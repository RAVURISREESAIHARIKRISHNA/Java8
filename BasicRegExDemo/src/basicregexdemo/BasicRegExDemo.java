package basicregexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegExDemo
{
    public static void main(String[] args)
    {
        System.out.println("Creating Pattern On=bject...");
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ababbabab");
        
        int count = 0;
        
        while(m.find())
        {
            count ++;
            System.out.println(m.start()+"..."+m.end()+"..."+m.group());
        }
        System.out.println("Count = "+count);
    }
}
