package enumimple;
enum Color
{
	Red,Blue,Green,Yellow
}

class EnumImple
{
	public static void main(String args[])
	{
		//Creating an Enum Object
		Color obj;
		obj = Color.Red;
		System.out.println("My Favourite color is : "+obj);
		obj = Color.Blue;
		if(obj == Color.Red)
			System.out.println("RED");
		if(obj == Color.Blue)
			System.out.println("BLUE");
		if(obj == Color.Green)
			System.out.println("GREEN");
		if(obj == Color.Yellow)
			System.out.println("YELLOW");
		
		switch(obj)
		{
			case Red:
				System.out.println("RED");
				break;
			case Blue:
				System.out.println("BLUE");
				break;
			case Green:
				System.out.println("GREEN");
				break;
			case Yellow:
				System.out.println("YELLOW");
				break;
		}
	}
}