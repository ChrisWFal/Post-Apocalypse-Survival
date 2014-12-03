
public class RottenFood extends Food
	{
	public RottenFood()
		{
		rare = "common";
		item = "Rotten food";
		amountOfSpace = "1 inventory space";
		isBreakable = (Breakable) new CannotBreak();
		}

	@Override
	public void usedFor()
		{
		System.out.println("Rotten food should only be eaten if you are extremely desperate");
		
		}
	@Override
	public void valuable()
		{
		
		}
	@Override
	public void effects()
		{
		System.out.println("Eating rotten food may solve hunger issues temporarily but will make you sick.");
		}

	}
