package quadtraticeq;

public class Quadratic
{
    protected Double a;
    protected Double b;
    protected Double c;

    public Quadratic(Double a, Double b, Double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String toString()
    {
        return("a:"+this.a+"\nb:"+this.b+"\nc:"+this.c);
    }
    
    public boolean feasible()
    {
        if(this.b*this.b-4*this.a*this.c>=0)
            return true;
        return false;
    }
    
    public Double[] solution()
    {
//        if(this.feasible()==1)
//        {
            Double x = (-1*this.b)/(2*this.a);
            Double y = Math.sqrt(this.b*this.b-4*this.a*this.c)/this.a*2;
            Double X[] = {x+y,x-y};
            return X;
            //Will Return NaN (Not a Number) if imaginary....
        //}
    }
}