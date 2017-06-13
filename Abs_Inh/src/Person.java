//This is not Standalone .java File this Requires the Main FIle
abstract class Person
{
    protected String Name;
    protected String Email;

    public Person(String Name, String Email)
    {
        this.Name = Name;
        this.Email = Email;
    }
    
    public void print()
    {
        System.out.println(this.Name);
        System.out.println(this.Email);
        
    }
   abstract public void printStatus();
}

class Faculty extends Person
{
    private int id;
    private String subjects;
    
    public Faculty(String Name,String Email,int id,String Subjects)
    {
        super(Name,Email);
        this.id = id;
        this.subjects = subjects;
    }
    public void printStatus()
    {
        super.print();
        System.out.println(this.id);
        System.out.println(this.subjects);
    }
    
}

class Student extends Person
{
    private int id;
    private String courses;
    public Student(String Name,String Email,int id,String courses)
    {
        super(Name,Email);
        this.id=id;
        this.courses=courses;
    }
    public void printStatus()
    {
        super.print();
        System.out.println(this.id);
        System.out.println(this.courses);
    }
}