class Student
{
	private String name;
	private int Roll;
	
	Student()
	{
		System.out.println("\nBASE CLASS DEFAULT CONSTRUCTOR CALLED\n");
	}
	
	Student(String name,int Roll)
	{
		this.name=name;
		this.Roll=Roll;
		System.out.println("\nBASE CLASS PARAMETERIZED CONSTRUCTOR CALLED\n");
	}
	void Display()
	{
		System.out.println("Name : "+name+"\nRoll : "+Roll);
	}
}

class Result extends Student
{
	private int sub1,sub2,total;
	
	Result()
	{}
	
	Result(String name,int Roll,int sub1,int sub2)
	{
		super(name,Roll);
		this.sub1=sub1;
		this.sub2=sub2;
		total=sub1+sub2;
		System.out.println("\nDERIVED CLASS PARAMETERIZED CONSTRUCTOR CALLED\n");
	}
	
	void Display()
	{
		super.Display();
		System.out.println("Sub 1 : "sub1+"\nSub 2 : "+sub2+"\nTotal : "+total);
	}
}

class SimpleInherit
{
	public static void main(String a[])
	{
		Result OBJ = new Result("Hari",38,100,100);
		OBJ.Display();
	}
}