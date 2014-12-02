
public class Knife extends Weapons
	{
	public Knife()
		{
		rare = "common";
		item = "knife";
		amountOfSpace = "1 inventory space";
		}

	@Override
	public void usedFor()
		{
		System.out.println("The knife can be used to defend yourself or to open canned food.");
		
		}

	@Override
	public void canBeFound()
		{
		System.out.println("knives can be found in almost all houses");
		
		}
	
	}
