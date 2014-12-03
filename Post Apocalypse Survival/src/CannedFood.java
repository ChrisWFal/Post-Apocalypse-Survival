
public class CannedFood extends Food
	{
	public CannedFood()
		{
		rare = "scarse";
		item = "canned food";
		amountOfSpace = "1 inventory space";
		isBreakable = (Breakable) new CannotBreak();
		}

	@Override
	public void usedFor()
		{
		System.out.println("Canned food takes up little space and very filling.");
		
		}

	public void effects()
		{
		System.out.println("Eating canned food will restore some strength and keep hunger low.");
		}
	

	}
