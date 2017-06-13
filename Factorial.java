package factorial;

class fact
{
    float Fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return(n*Fact(n-1));
    }
}

class Factorial
{
    public static void main(String a[])
    {
        //An Object is Required to Call the Fact(n)
        fact obj;
        obj=new fact();
        
        
        for(int i=0;i<=10;i++)
        {
            System.out.println("Factorial of "+i+" is "+obj.Fact(i));
        }
    }
}