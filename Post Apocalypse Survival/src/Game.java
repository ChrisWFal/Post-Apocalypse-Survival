import java.util.Scanner;

public class Game
	{
	static String name;
	static boolean alive = true;
	static int choice;

	
	public static void mainMenuRun()
		{
		greet();
		house();
		}
	public static void greet()
		{
		System.out.println("Welcome friend, whats your name?");
		Scanner userInput = new Scanner(System.in);
		name = userInput.nextLine();
		
		System.out.println("Ahhhh its nice to meet you " + name + ", I'm John, we found you passed out on the side of the road a few days "
				+ "back, we've decided that you can stay with us as long as you pull your own weight. My brother Pablo and I found this"
				+ "House a while back and have been living here ever since, its relativly safe, feel free to look around.");	

		}
	public static void survivalGuide()
		{
		Items [] item = new Items[4];
		item[0] = new CannedFood();
		item[1] = new RottenFood();
		item[2] = new Gun();
		item[3] = new Knife();
		
		for (int i = 0; i < 4; i ++)
			{
			item[i].topic();
			item[i].takeSpace();
			item[i].usedFor();
			item[i].valuable();
			item[i].effects();
			item[i].canBeFound();
			item[i].isBreakable.breaks();
			
			System.out.println();
			}
		
		house();
		}
	public static void house()
		{
		while(alive == true)
			{
			System.out.println("Do you want to 1.sleep 2.eat 3.scavenge 4. read survival guide");
			
			Scanner action = new Scanner(System.in);
			choice = action.nextInt();
			
			switch(choice)
			{
			case 1:
				{
				System.out.println("You climb into the creaky bed and eventually fall asleep");
				
				break;
				}
			case 2:
				{
				
				break;
				}
			case 3:
				{
				
				break;
				}
			case 4:
				{
				System.out.println("You open up the survival guide...");
				survivalGuide();
				
				break;
				}
			}
			
			
			}
		}
	
	}
