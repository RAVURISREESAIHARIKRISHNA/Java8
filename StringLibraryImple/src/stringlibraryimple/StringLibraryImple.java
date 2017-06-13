package stringlibraryimple;

public class StringLibraryImple
{
    public static void main(String arg[])
    {
        System.out.println("*******************String Library Functions Implementation**********************");
        
        
        System.out.println("\n\nString Constructors");
        String x = new String();
        System.out.println(x);
        
        char array[] = {'a','b','c','d','e','f'};
        String y = new String(array);
        System.out.println(y);
        
        String z = new String(y);
        System.out.println(z);
        
        String m = "Hello World!";
        
        System.out.println(x.length());
        System.out.println(y.length());
        System.out.println(z.length());
        System.out.println(m.length());
            
        for(int i=0;i<=y.length()-1;i++)
        {
            System.out.println(y.charAt(i));;
        }
        
        System.out.println("x==y"+x.equals(y));
        System.out.println("y==z"+y.equals(z));
        System.out.println("x==z"+x.equals(z));
        /*
        Equals VS ==
        
        equals()
            this method compares the strings of the String Objects
        ==
            this method compares the Object references(i.e. the addresses to which the Object References are pointing to)
        */
        
        
        System.out.println("y start with \"abc\"?"+y.startsWith("abc"));
        System.out.println("y ends with \"abc\"?"+y.endsWith("abc"));
        
        String l = "Hello";
        String k = "Hello";
        String j = k;
        
        System.out.println("l==k"+l==k);
        System.out.println("l.equals(k)"+l.equals(k));
        System.out.println("j==k"+j==k);
        System.out.println("j.equals(k)"+j.equals(k));
        
        
    }
}
