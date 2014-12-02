
public class Traders extends Survivors
	{
	public void sell()
		{
		System.out.println("Traders trade their items to other survivors.");
		}
	public void loot()
		{
		System.out.println("Traders loot buildings to find more items to trade");
		}
	@Override
	public void help()
		{
		System.out.println("Traders rarely help people for free.");
		}
	}
