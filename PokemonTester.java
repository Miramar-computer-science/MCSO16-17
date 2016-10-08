import java.util.*;
/*
 * Every time the user cathces a pokemon, increment the XP by 100, and yo, 10 for trying
 * 
 * view pokemons option
 */
public class PokemonTester 
{
	public  static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String temp, name, command;
		int starter;
		Pokemon first = null;
		Pokemon[] hunting = new Pokemon[5];
		Pokemon next = null;
		
		hunting[0] = new Pokemon("Pidgey", "Normal/Flying", 40,45, 5); //lol pidgeys are rare!!!
		hunting[1] = new Pokemon("Articuno", "Ice/Flying", 90,85,20);
		hunting[2] = new Pokemon("Zapados", "Electric/Flying", 90,90,20);
		hunting[3] = new Pokemon("Moltres", "Fire.Flying", 90, 100, 20);
		hunting[4] = new Pokemon("Mewtwo", "Psychic", 106, 110, 20);
		
		
		System.out.println("Starting your Pokemon Adventure");
		System.out.print("You have just woken up from a deep dream. Please enter your name: ");
		name = keyboard.nextLine();
		
		System.out.println("GO meet your professor!");
		System.out.print("... ...\n" + "Your professor gives a choice of three pokemons."
				+ "\nPlease choose a pokemon: Charmander(enter 1), Squirtle(enter 2), Bulbasaur(enter 3):");
		temp = keyboard.nextLine();
		starter = Integer.parseInt(temp);
		
		if(starter == 1)
		{
			first = new Pokemon("Charmander", "Fire", 39, 52, 6);
		}
		else if (starter == 2)
		{
			first =  new Pokemon("Squirtle", "Water", 44, 48, 6);
		}
		else if(starter == 3)
		{
			first = new Pokemon("Bulbasaur", "Grass", 45,49, 6);
		}
		
		Trainer user = new Trainer(first, name);
		System.out.println("You earned 50 XP for receiving your first Pokemon");
		user.incrementXP(50);
		int numOfMiles; 
		int randomNum;
		boolean isCaught = false;
		int randomRarity;
		int prob;
		String throwPokeball;
		while(true)
		{
			//check if the user is ready to level up
			if(user.getXP() > 100 )
			{
				System.out.println("You just leveled up to level " + user.getXP()/100);
				user.incrementLevel();
				user.setXP(user.getXP()%100);
			}
			
			System.out.println(user);
			
			System.out.print("Please enter an action: ");
			command = keyboard.nextLine();
			
			//if it is walk
			if(command.equalsIgnoreCase("walk"))
			{
				System.out.print("Please enter the amount of miles that you just walked: ");
				temp = keyboard.nextLine();
				numOfMiles = Integer.parseInt(temp);
				user.incrementMiles(numOfMiles);
				System.out.print("Are you walking near or around a park? (yes, no) ");
				String inPark = keyboard.nextLine();
				if(inPark.equalsIgnoreCase("yes"))
				{
					user.setNearPark(true);
					prob = 50;
				}
				else
				{
					user.setNearPark(false);
					prob = 10;
				}
				user.setProbOfCatching(numOfMiles + prob);
				randomNum = (int)(Math.random()*100 +1);
				if(randomNum <= user.getProbOfCatching())
				{
					next = hunting[(int)(Math.random()*5)];
					System.out.println("You have found a wild " + next.getName());
					while(isCaught == false)
					{
						
						
						System.out.print("Would you like to use a pokeball to try to catch it? ");
						throwPokeball = keyboard.nextLine();
						if(throwPokeball.equalsIgnoreCase("yes"))
						{
							randomRarity = (int)(Math.random()*100)+1;
							user.useBall();
							if(user.getBalls() <= 0)
							{
								break;
							}
							
							if(randomRarity <= next.getRarity())
							{
								user.addPokemon(next);
								user.incrementXP(100);// 100 for getting a pokemon
								user.setProbOfCatching(prob);
								System.out.println("You caught " + next.getName());
								System.out.println("You earned 100 XP for catching " + next.getName());
								isCaught = true;
								break;
							}
							else
							{
								user.incrementXP(10);
								System.out.println(next.getName() + " got out of the pokeball!");
								System.out.println("You earned 10 XP for attempting the catch");
							}//end of catching the pokemon
						}//if the user chooses to throw a pokeball
						else
						{
							System.out.println("Alright! We'll stop walking!");
							isCaught = true;
						}
					
						
					}//end while
					
			
				}//end if
				else
				{
					System.out.println("Keep on walking, no pokemon so far...");
				}
			}//end if for walking
			else if(command.equalsIgnoreCase("View"))
			{
				for(int i = 0; i < user.getPokemons().size(); i++)
				{
					System.out.println(user.getPokemons().get(i));
				}
			}
		}
		
	}
}
