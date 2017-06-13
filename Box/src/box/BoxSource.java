package box;

import java.util.Scanner;
import java.lang.System;
class BoxSource
{
    BoxSource()
    {
        System.out.println("***** WELCOME TO BOX *******");
    }
    
    BoxSource(Double l,Double b,Double w)
    {
        super();
        this.EnterData(l, b, w);
        
    }

    protected double l;
    protected double w;
    protected double b;
    
    public void EnterData()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length of the Box:");
        this.l = s.nextDouble();
        System.out.println("Enter Breadth of the Box:");
        this.b = s.nextDouble();
        System.out.println("Enter Width of the Box:");
        this.w = s.nextDouble();
    }
    
    public void EnterData(Double l,Double b,Double w)
    {
       // Scanner s = new Scanner(System.in);
        //System.out.println("Enter Length of the Box:");
        this.l = l;
        //System.out.println("Enter Breadth of the Box:");
        this.b = b;
        //System.out.println("Enter Width of the Box:");
        this.w = w;
    }
    
    public Double Volume()
    {
        return((this.l)*(this.b)*(this.w));
        
    }
    
    public Double Area()
    {
     
        return(this.l*this.b);
    }
    
    public void Display()
    {
        for(int i=0;i<=10;i++)
            System.out.print("*");System.out.printf("\n");
        
        System.out.println("Length is :"+this.l);
        System.out.println("Breadth is : "+this.b);
        System.out.println("Width is : "+this.w);
        for(int i=0;i<=10;i++)
            System.out.print("*");System.out.printf("\n");
        
        
    }
}