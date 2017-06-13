package enumimple1;
enum Color
{
	Red,Blue,Green,Yellow
}

class EnumImple1
{
	public static void main(String args[])
	{
		Color obj;
		System.out.println("The Values of Enumeration are");
		for(Color x : Color.values())//Color.vlues() Returns an array of all Enumerated Data...
			System.out.println(x);
		obj = Color.valueOf("Blue");
		
		//Color.valueOf() Returns the ennumeration Constant of the String(Value Corresponding) passed to it.
		System.out.println("The Value of obj is :"+obj);
	}
}