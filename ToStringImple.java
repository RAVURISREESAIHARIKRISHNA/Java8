package tostringimple;
//toString() Implementation...

class Box
{
	int l,b,h;
	Box(int l,int b,int h)
	{
		this.l = l;
		this.b = b;
		this.h = h;
	}


//Defining toString()
        //It should be the part of the class in which it should be Dfined
public String toString()
{
	return("The Dimensions are \nLength :"+l+"\nWidth :"+b+"\nHeight :"+h);
}
}
class ToStringImple
{
	public static void main(String args[])
	{
		Box OBJ = new Box(1,2,3);
		System.out.println(OBJ);//Implicit call to toString()
	}
}