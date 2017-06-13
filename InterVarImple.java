package intervarimple;
//Variables in Interfaces
/*
Variables in interfaces are static and Final
*/
import java.util.Random;//Lets Talk about this Later.Consider this for now.
interface Constants
{
	int ZERO=0;//As it is Static it will be initialised to 0 by Default
	int ONE =1;
	int TWO = 2;
	int THREE = 3;
	int FOUR = 4;
	int FIVE = 5;
	int SIX = 6;
	int SEVEN = 7;
	int EIGHT = 8;
	int NINE = 9;
}

class Client implements Constants
{
	void Display(){
	Random OBJ = new Random();
	int temp = (int)(10 * OBJ.nextDouble());
	switch(temp)
	{
		case ZERO:
			System.out.println("");
			break;
		case ONE:
			System.out.println("ONE");
			break;
		case TWO:
			System.out.println("TWO");
			break;
		case THREE:
			System.out.println("THREE");
			break;
		case FOUR:
			System.out.println("FOUR");
			break;
		case FIVE:
			System.out.println("FIVE");
			break;
		case SIX:
			System.out.println("SIX");
			break;
		case SEVEN:
			System.out.println("SEVEN");
			break;
		case EIGHT:
			System.out.println("EIGHT");
			break;
		case NINE:
			System.out.println("NINE");
			break;
                default:
                    System.out.println(temp);
	}}
}

class InterVarImple
{
	public static void main(String arg[])
	{
		Client Ref = new Client();
		Ref.Display();
                Ref.Display();
                Ref.Display();
                Ref.Display();
                Ref.Display();
		
	}
}