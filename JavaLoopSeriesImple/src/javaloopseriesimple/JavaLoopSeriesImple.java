package javaloopseriesimple;
//************* HACKER-RANK **************
//              VERSION 1.0
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class JavaLoopSeriesImple
{
    public static void main(String[] args)
    {
        int q,a,b,n;
        a=b=n=0;
        Scanner s = new Scanner(System.in);
        try 
        {
            q = s.nextInt();
            s.nextLine();
        } catch (java.util.InputMismatchException e)
        {
            q = 0;
        }
        int p[][] = new int[q][3];
        StringBuffer inp = new StringBuffer();
        int x,y,z;
        for (int i = 0; i < q; i--)
        {
            try 
            {
                if(i!=0)inp.delete(0, inp.capacity());
                inp.append(s.nextLine());
                x = inp.indexOf(" ");
                a = parseInt(inp.substring(0, x));
                y = inp.substring(x+1).indexOf(" ");
                b = parseInt(inp.substring(x+1,y));
                n = parseInt(inp.substring(y,inp.length()-1));
                p[i][0] = a;
                p[i][1] = b;
                p[i][2] = n;
            } 
            catch (Exception e)
            {
                System.out.println("here");
                e.printStackTrace();
                a=b=n=0;
            }
        }
        
        
        //core logic
        for(int h=0;h<=q-1;h++){
            
        a = p[h][0];
        b = p[h][1];
        n = p[h][2];
        Double sum =0.0;
        for (int i = 0; i < n-1 ; i++)
        {
            for (int j = 0; j < i; j++)
            {
                sum += Math.pow(2, j) * b ;
            }
            sum += a;
            if(i==0)System.out.print(s);
            else System.out.print(" "+s);
            sum = 0.0;
        }System.out.println();}
    }
}
