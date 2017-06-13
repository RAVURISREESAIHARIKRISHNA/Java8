package javaloopseriesimple1;

import java.util.Scanner;

public class JavaLoopSeriesImple1
{

    public static void main(String[] args)
    {
        int q, a, b, n;
        Scanner s = new Scanner(System.in);
        q = s.nextInt();
        int p[][] = new int[q][3];

        for (int i = 0; i <= q - 1; i++)
        {
            p[i][0] = s.nextInt();
            p[i][1] = s.nextInt();
            p[i][2] = s.nextInt();
        }

//core logic
        for (int h = 0; h <= q - 1; h++)
        {

            a = p[h][0];
            b = p[h][1];
            n = p[h][2];
            int sum = 0;
            for (int i = 0; i <= n - 1; i++)
            {

                for (int j = 0; j <= i; j++)
                {
                    sum += Math.pow(2, j) * b;
                }
                sum += a;
                if (i == 0)
                {
                    System.out.print(sum);
                } else
                {
                    System.out.print(" " + sum);
                }
                sum = 0;
            }
            System.out.println();
        }
    }
}
