package genericdemo;

public class GenericDemo
{
    public static void main(String[] args)
    {
        System.out.println("Creating a Generic Object of Integer...");
        
        GenericSrc <Integer> obj = new GenericSrc <Integer> (new Integer(45));
        
        int value;
        value = obj.getOb().intValue();
        System.out.println(value);;
        obj.showType();
        
        System.out.println("Creating Generic Object of type String...");
        
        GenericSrc <String> obj1 = new GenericSrc <String> ("Hello World!");
        String data = null;
        data = obj1.getOb().toString();System.out.println(data);
        obj1.showType();
    }
}
