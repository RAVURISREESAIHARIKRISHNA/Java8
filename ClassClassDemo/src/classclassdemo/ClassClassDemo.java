package classclassdemo;

import java.lang.reflect.Method;

public class ClassClassDemo
{

    public static void main(String[] args)
    {
        System.out.println("Creating an Object of Class Student");
        Student obj = new Student("Hari KRishna", 38);

        Class c = obj.getClass();
        System.out.println("The Complete Qualified Class Name of obj is : " + c.getName());
        Method[] m = c.getDeclaredMethods();
        for (Method i : m)
        {
            System.out.println(i);
        }
        Class c1 = (new String()).getClass();
        Method m1[] = c1.getDeclaredMethods();
        int count = 0;
        for (Method i : m1)
        {
            count++;
            System.out.println(i);
        }
        System.out.println(count);
    }
}
