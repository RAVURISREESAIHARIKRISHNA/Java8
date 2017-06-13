package overridehashcodedemo;

public class StudentOver
{

    protected String name;
    protected int roll;

    public StudentOver(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof StudentOver)
        {
            StudentOver obj = (StudentOver) o;
            if (this.name.equals(obj.name) && this.roll == obj.roll/* && this.hashCode() == obj.hashCode()*//*DOES NOT OVERRIDE OBJECT CLASS EQUALS METHOD*/)
            {
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
//        if(this.hashCode() == obj.hashCode()){
//            return true;
//        }
//        else{
//            return false;
//        }

    }

    @Override
    public int hashCode()
    {
        int hash = 7;
//        hash = 23 * hash + Objects.hashCode(this.name);
//        hash = 23 * hash + this.roll;
        return hash;
    }
}
