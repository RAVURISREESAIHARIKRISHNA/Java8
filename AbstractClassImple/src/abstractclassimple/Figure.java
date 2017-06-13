package abstractclassimple;

import java.lang.System;

public abstract class Figure
{
    protected Double l;
    protected Double b;

    public Figure(Double l, Double b)
    {
        this.l = l;
        this.b = b;
    }
    
    //Abstract method
    abstract Double area();
    public void display()
    {
        System.out.println("************");
        System.out.println("Value of l is:"+this.l+"\nValue of b is : "+this.b);
        System.out.println("************");
    }
}

class Rectangle extends Figure
{

    public Rectangle(Double l, Double b)
    {
        super(l, b);
    }
    
    public Double area()
    {
        return this.l*this.b;
    }
}

class Square extends Figure
{

    public Square(Double l, Double b)
    {
        super(l, b);
    }
    
    public Double area()
    {
        return this.l*this.l;
    }
}

class Triangle extends Figure
{

    public Triangle(Double l, Double b)
    {
        super(l, b);
    }
    
    public Double area()
    {
        return(1/2)*this.l*this.b;
        
    }
}