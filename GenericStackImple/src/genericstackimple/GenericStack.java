package genericstackimple;

public class GenericStack<T>
{

    private T a[];
    private int size;
    private int top;

    public GenericStack(T[] o, int size)
    {
        this.a = o;
        this.size = size;
        this.top = -1;
    }

    public void push(T o)
    {
        if(top<size-1){
            a[++top]=o
        }
    }
}
