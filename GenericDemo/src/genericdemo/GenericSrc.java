package genericdemo;

public class GenericSrc <T>
{
    protected T obj;

    public GenericSrc(T obj)
    {
        this.obj = obj;
    }
    
    public T getOb()
    {
        return obj;
    }
    
    public void showType()
    {
        System.out.println(obj.getClass().getName());
    }
}
