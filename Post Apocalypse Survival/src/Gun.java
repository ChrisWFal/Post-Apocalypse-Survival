
public class Gun extends Weapons
	{
	public Gun()
		{
		super("This weapon makes a loud bang");
		rare = "very scarse";
		item = "Handgun";
		amountOfSpace = "3 inventory spaces";
		isBreakable = (Breakable) new CanBreak();
		}

	@Override
	public void usedFor()
		{
		System.out.println("the handgun can be used to defend yourself against bandits.");
		
		}

	@Override
	public void canBeFound()
		{
		System.out.println("handguns can be found in any police or military facility and some houses.");
		
		}
	
	
	}
