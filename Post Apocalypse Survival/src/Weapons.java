
public abstract class Weapons extends Items
	{
	private final String noise;
	
	protected Weapons (String noise)
		{
		this.noise = noise;
		}
	public void valuable()
		{
		System.out.println("Weapons are extremely valuable, you cannot survive without them.");
		System.out.println(noise);
		}
	public void effectiveness()
		{
		System.out.println("the " + item + " is extremely effective for defending yourself.");
		}
	@Override
	public void effects()
		{
		
		}
	}
