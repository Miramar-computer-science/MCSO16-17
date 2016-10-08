//this guy has an everlasting water supply....
/*
 * 	private int bodyHeat;
	private int hunger;
	private int food;
	private int wood;
	private int stamina;
	private int numOfItems;
	private int miles;
	private final int maxItems = 10;
	
	print out status every time and check for over items each time you travel
	//check for over 100 method
 */
import java.util.*;

public class Wilderness 
{
	public static void main(String[] args)
	{
		Human user = new Human();
		Scanner keyboard = new Scanner(System.in);
		String command;
		
		System.out.println("Your car just got stuck in the mud. It's raining... \nGoing out of the car and check out the situation"
				+ "\nThrough your spidey senses, you know that you are 40 miles from safety.\nYou happened to have 5 wood and 5 food."
				+ "\nYou should keep on moving");
		while(user.getMiles() < 40)
		{
			//changing weather status
			//if it's cold
			/*System.out.println("\n*********" );
			if(getRandomWeather() == 1)
			{

				System.out.println("It's raining! You're getting colder... You lost 15 Body Heat");
				user.setBodyHeat(user.getBodyHeat()-15);
				
				
			}
			//if it's hot
			else
			{
				System.out.println("The sun's out! You're getting warmer. You got 5 Body Heat");
				user.setBodyHeat(user.getBodyHeat()+5 );
				if(user.getBodyHeat() > 100)
				{
					user.setBodyHeat(100);
				}
				
			}
			*/
			//checking to see if your alive
			if(user.getBodyHeat()< 10 && user.getBodyHeat()>0)
			{
				System.out.println("You're freezing to death! Make a fire soon");
				
			}
			else if(user.getBodyHeat() <= 0)
			{
				System.out.println("You froze to death");
				System.out.println(user + "\nGame Over");
				System.exit(0);
			}
			if(user.getHunger()<10 && user.getHunger()>0)
			{
				System.out.println("You're dying of hunger!!!");
			}
			else if(user.getHunger() <= 0)
			{
				System.out.println("You died of starvation");
				System.out.println(user + "\nGame Over");
				System.exit(0);
			}
			if(user.getStamina() < 10 && user.getStamina() > 0)
			{
				System.out.println("You're dying of fatigue");
			}
			else if(user.getStamina()<= 0)
			{
				System.out.println("You died of fatigue");
				System.out.println(user + "\nGame Over");
				System.exit(0);
			}
			System.out.println( user);
			System.out.print("Enter a command: (Move, eat, fire, sleep, help):");
			command = keyboard.nextLine();
			if(command.equalsIgnoreCase("move"))
			{
				//check for items
				if(user.getNumOfItems() > 10)
				{
					System.out.println("Can't move, you must eat or make a fire to get rid of your items!");
				}
				else
				{
					int miles = (int)(Math.random()*10)+1;
					System.out.println("You were able to move " + miles + " miles");
					System.out.println("You also lost " + miles * 5 + " stamina while moving") ;
					System.out.println("You also lost 20 hunger while moving") ;
					user.setStamina(user.getStamina()- miles*5);
					user.setHunger(user.getHunger()-20);
					user.setMiles(user.getMiles() + miles);
				}
			}
			else if (command.equalsIgnoreCase("eat"))
			{
				if(user.getFood()>0)
				{
					System.out.println("You ate your food. You gained 20 hunger");
					user.decrementFood();
					user.setHunger(user.getHunger()+20);
					if(user.getHunger() > 100)
					{
						user.setHunger(100);
					}
				}
				else
				{
					System.out.println("You're out of food. Go look for some...");
					if((int)(Math.random()*100)+1 < 50)
					{
						System.out.println("You found food!!! You ate it! You gained 20 Hunger");
						user.setHunger(user.getHunger()+20);
						if(user.getHunger() > 100)
						{
							user.setHunger(100);
						}
						
					}
					else
					{
						System.out.println("You're out of luck! You couldn't find any food");
					}
				}
			}
			else if(command.equalsIgnoreCase("fire"))
			{
				if(user.getWood()>0)
				{
					System.out.println("You built a fire. You gained 20 Body heat");
					user.decrementWood();
					user.setBodyHeat(user.getBodyHeat()+20);
					if(user.getBodyHeat() > 100)
					{
						user.setBodyHeat(100);
					}
				}
				else
				{
					System.out.println("You're out of Wood. Go look for some...");
					if((int)(Math.random()*100)+1 < 50)
					{
						System.out.println("You found wood!!! You ate it!");
						user.setBodyHeat(user.getBodyHeat()+20);
						if(user.getBodyHeat() > 100)
						{
							user.setBodyHeat(100);
						}
						
					}
					else
					{
						System.out.println("You're out of luck! You couldn't find any wood");
					}
				}
			}
			
			else if(command.equalsIgnoreCase("sleep"))
			{
				System.out.println("Taking a nap");
				user.setStamina(user.getStamina()+20);
				System.out.println("By sleeping you lost 10 Hunger");
				user.setHunger(user.getHunger()-10);
			}
			
			else if(command.equalsIgnoreCase("Help"))
			{
				System.out.println("Sleep to gain Stamina, Eat to gain hunger, make fire to gain body heat");
			}
			else{
				System.out.println("Try again");
				System.exit(0);
			}
			
			
		
		}//end while
		System.out.println("Congradulations! You survived!");
		System.out.println(user + "Game over.");
		System.exit(0);
		
	}
	
	//1: cold, 2: warm
	public static int getRandomWeather()
	{
		return (int)(Math.random()*2)+1;
	}
}
