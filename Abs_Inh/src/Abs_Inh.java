//This is not Standalone .java File this Requires the Classes File
public class Abs_Inh
{
    public static void main(String arg[])
    {
        Person p;
        p = new Faculty("Hari","harirsskrisna@gmail.com",38,"C,C++,Python,Java");//Upcasting
        System.out.println("\"Person Class Pointer Upcasted to Faculty\"");
        p.printStatus();
        p = new Student("Hari Krishna","harirsskrishna@yahoo.in",38,"Ruby,Java Script,C#");
        System.out.println("\"Person Class Pointer Upcasted to Student\"");
        p.printStatus();
    }
}