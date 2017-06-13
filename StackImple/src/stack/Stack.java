package stack;

class Stack
{
    private int a[];
    private int size;
    private int top;
    Stack()
    {
        a = new int[10];
        size = 10;
        this.top = -1;
    }
    Stack(int size)
    {
        a = new int[size];
        this.size = size;
        this.top = -1;
    }
    public void push(int x)
    {
        if(top<size-1)
        {
            a[++top] = x;
            return;
        }
        else
        {
            System.out.println("STACK OVERFLOW");
            return;
        }
    }
    public int pop()
    {
        if(!(top>-1))
        {
            //System.out.println("STACK UNDERFLOW");
            return -1;
        }
        else
        {
            return a[top--];
        }
    }
    public void display()
    {
        if(top>-1&&top<=size-1)
        {
            System.out.println("***** STACK ***********");
            for(int i=top; i>=0;i--)
                System.out.println(a[i]);
            System.out.println("**************");
            return;
        }
        else
        {
            System.out.println("Stack does not exist");
            return;
        }
    }
    public int isEmpty()
    {
        if(top==-1)
            return 1;
        return 0;
    }
    public int isFull()
    {
        if(top==size-1)
            return 1;
        return 0;
    }
}