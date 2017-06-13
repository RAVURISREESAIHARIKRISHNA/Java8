package matriximple;

import java.util.Scanner;
import java.lang.System;


public class Matrix
{
    protected Double a[][];
    protected Double b[][];
    protected int am,an;
    protected int bm,bn;

    public Matrix(int am, int an, int bm, int bn)
    {
        this.am = am;
        this.an = an;
        this.bm = bm;
        this.bn = bn;
        System.out.println("MATRIX A");
        Scanner s = new Scanner(System.in);
        for(int i =0 ;i<=am-1;i++)
            for(int j=0;j<=an-1;j++)
            {
                System.out.println("Enter "+i+"X"+j+" Element:");
                a[i][j]=s.nextDouble();
            }
        
        System.out.println("MATRIX B");
        //Scanner s = new Scanner(System.in);
        for(int i =0 ;i<=am-1;i++)
            for(int j=0;j<=an-1;j++)
            {
                System.out.println("Enter "+i+"X"+j+" Element:");
                b[i][j]=s.nextDouble();
            }
    }

    public Matrix(Double[][] a, Double[][] b, int am, int an, int bm, int bn)
    {
        this.a = a;
        this.b = b;
        this.am = am;
        this.an = an;
        this.bm = bm;
        this.bn = bn;
    }
    
    public Double [][] product()
    {
        if(an==bm)
        {
           Double x[][]=new Double[am][bn];
           
           Double sum=0.0;
           
            for (int i = 0; i < am; i++)
            {
                for (int j = 0; j < bn; j++) 
                {
                    for (int k = 0; k < bm; k++) 
                    {
                        sum = sum + a[i][k] * b[k][j];
                    }

                    x[i][j] = sum;
                    sum = 0.0;
                }
            }
            return x;
        }
        else
        {
//            Double x[][]=new Double[am][bn];
//            for(int i=0;i<=am-1;i++)
//                for(int j=0;j<=bn-1;j++)
//                    x[i][j]=0.0;
//            return x;
            //System.exit(0);
            return null;
        }
    }
    
    public Double[][] add()
    {
        if(am==bm&&an==bn)
        {
            Double x[][] = new Double [am][an];
            for(int i=0;i<=am-1;i++)
                for(int j=0;j<=an-1;j++)
                    x[i][j]=a[i][j]+b[i][j];
            return x;
        }
        else
            return null;
    }
    
    public Double [][] sub()
    {
        if(am==bm&&an==bn)
        {
            Double x[][] = new Double [am][an];
            for(int i=0;i<=am-1;i++)
                for(int j=0;j<=an-1;j++)
                    x[i][j]=a[i][j]-b[i][j];
            return x;
        }
        else
            return null;
    }
    
    public void constMulti(int k)
    {
        for(int i=0;i<=am-1;i++)
            for(int j=0;j<=an-1;j++)
                a[i][j]*=k;
        for(int i=0;i<=bm-1;i++)
            for(int j=0;j<=bn-1;j++)
                b[i][j]*=k;
        
    }
    public void constAdd(int k)
    {
        for(int i=0;i<=am-1;i++)
            for(int j=0;j<=an-1;j++)
                a[i][j]+=k;
        for(int i=0;i<=bm-1;i++)
            for(int j=0;j<=bn-1;j++)
                b[i][j]+=k;
        
    }
}