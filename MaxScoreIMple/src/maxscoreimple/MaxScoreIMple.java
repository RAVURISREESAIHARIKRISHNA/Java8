
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxScoreIMple
{

    static long getMaxScore(long[] a)
    {
        Double
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for (int a_i = 0; a_i < n; a_i++)
        {
            a[a_i] = in.nextLong();
        }
        long maxScore = getMaxScore(a);
        System.out.println(maxScore);
    }
}
