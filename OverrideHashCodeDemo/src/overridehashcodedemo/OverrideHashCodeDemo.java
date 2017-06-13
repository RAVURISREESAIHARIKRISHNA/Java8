package overridehashcodedemo;

public class OverrideHashCodeDemo
{
    public static void main(String[] args)
    {
        Student obj1 = new Student("Hari Krishna",38);
        Student obj2 = new Student("Chithanya",39);
        Student obj3 = new Student("Hari Krishna",38);
        Student obj4 = obj1;
        
        System.out.println("obj1.equals(obj2) : "+obj1.equals(obj2));
        System.out.println("obj1.equals(obj3) : "+obj1.equals(obj3));
        System.out.println("obj1.equals(obj4) : "+obj1.equals(obj4));
        
        StudentOver OBJ1 = new StudentOver("Hari Krishna",38);
        StudentOver OBJ2 = new StudentOver("Chithanya",39);
        StudentOver OBJ3 = new StudentOver("Hari Krishna",38);
        StudentOver OBJ4 = OBJ1;
        
        System.out.println("OBJ1.equals(OBJ2) : "+OBJ1.equals(OBJ2));
        System.out.println("OBJ1.equals(OBJ3) : "+OBJ1.equals(OBJ3));
        System.out.println("OBJ1.equals(OBJ4) : "+OBJ1.equals(OBJ4));
    }
}
