package enumimple2;
enum Color
{
	Red(1),Blue(2),Green(3),Yellow(4);
	private int cost;
	Color(int cost)
	{
		this.cost = cost;
	}
	
	int GetCost()
	{return this.cost;}
}

class EnumImple2
{
	public static void main(String args[]){
	System.out.println("All the Enumerated Data and their Costs are as Follows:");
	
	for(Color x : Color.values())
		System.out.println("The Name is "+x+" Its Cost is :"+x.GetCost());
	Color obj = Color.Red;
	System.out.println("The Cost of Red is :"+Color.Red.GetCost());}
}