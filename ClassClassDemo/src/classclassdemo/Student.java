package classclassdemo;

public class Student
{
    protected String name;
    protected int roll;

    public Student(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }
    
    public void display()
    {
        System.out.println(this.name);
        System.out.println(this.roll);
    }
    
}