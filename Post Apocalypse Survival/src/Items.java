
public abstract class Items
	{
	protected String rare;
	protected String item;
	protected String amountOfSpace;
	protected Breakable isBreakable;
	
	public void topic()
		{
		System.out.println(item);
		}
	public void takeSpace()
		{
		System.out.println("The " + item + " takes up " + amountOfSpace + " in your inventory");
		}
	
	public abstract void usedFor();
	
	public abstract void valuable();
	
	public abstract void effects();
	
	public abstract void effectiveness();
	
	public abstract void canBeFound();
	}
