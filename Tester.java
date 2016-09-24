import java.util.Scanner;

public class Tester 
{
	private void doTest()
	{
		RockPaperScissors user =null;
		RockPaperScissors ai=null;
		Scanner keyboard;
		char roundStatusUser;
		int userSign;
		int signAI;
		
		user = new RockPaperScissors("User");
		ai = new RockPaperScissors("AI");
		keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		user.setName();
		
		while(ai.getWins() < 3 && user.getWins() < 3)//does three rounds
		{
			System.out.println("**********************************");
			System.out.println("Round : " + user.getRounds());
			System.out.print("Please enter a sign. (Rock: 1, Paper: 2, Scissors: 3): ");
			userSign = keyboard.nextInt();
			if(userSign > 3 || userSign < 1)
			{
				System.out.println("That is not a valid sign");
			}
			
			while (userSign > 3 || userSign < 1)
			{
				System.out.print("Please enter a sign. (Rock: 1, Paper: 2, Scissors: 3): ");
				userSign = keyboard.nextInt();
				
			}
			
			System.out.print("Player Sign: ");
			user.printHandSign(userSign);
			
			System.out.print("The AI picked: ");
			signAI = user.getHandSign();
			user.printHandSign(signAI);
			
			
			roundStatusUser = user.getRoundStatus(userSign, signAI);
			
			if(roundStatusUser == 'W')
			{
				System.out.println("You Win!!!!");
				user.incrementWins();
				
			}
			else if(roundStatusUser == 'L')
			{
				System.out.println("You lose!!!");
				ai.incrementWins();
				
			}
			else if(roundStatusUser == 'T')
			{
				System.out.println("It's a Tie, Play Again!!!");
				
			}
			user.incrementRounds();
			System.out.println(ai.getName() + " wins : "  + ai.getWins());
			System.out.println(user.getName() +" wins: " + user.getWins());
			System.out.println("**********************************");
		}
		
		if(user.getWins() > ai.getWins())
		{
			System.out.println("Congradulations, you won " + user.getWins() + " rounds out of " + user.getRounds() + " \n You win the match");
			
		}
		else
		{
			System.out.println("Too bad, you lose! The AI won " + ai.getWins() + "rounds out of " + user.getRounds() + " \n You lose the Match");
		}
		
		keyboard.close();
		
		
	}
	
	
	public static void main(String[] args)
	{
		Tester tester = new Tester();
		tester.doTest();
		
		
	}
	
	class RockPaperScissors 
	{
		public static final int ROCK = 1; 
		public static final int PAPER = 2; 
		public static final int SCISSORS = 3;
		//public static final int LIZARD = 4;  
		//public static final int SPOCK = 5; 
		
		public static final String DEFAULT_NAME = "CPU"; 
		public static final int DEFAULT_WINS =  0; 
		
		private  int rounds = 1;  
		private  Scanner keyboard = new Scanner(System.in);
		
		private String name;    
		private int wins;
		
		
		public RockPaperScissors()
		{
			name = DEFAULT_NAME;
			wins = DEFAULT_WINS;
		}
		
		public RockPaperScissors(String name)
		{
			this.name = name;
			wins = 0;
			
		}

		public void setName()
		{
			String name;
			
			name = keyboard.nextLine();
			
			this.name = name;
		}
		
		
		public String getName()
		{
			return this.name;
			
		}
		
		public int getWins()
		{
			return this.wins;
		}
		
		public void incrementRounds()
		{
			rounds++;
		}
		
		public String toString()
		{
			return "/n the winner is : " + name;
		}
		
		public void incrementWins()
		{
			this.wins++;
		}
		
		
		
		public char getRoundStatus(int sign1, int sign2)
		{
			
			if(sign1 == ROCK)
			{
				if(sign2 == SCISSORS)
				{
					return 'W';
				}
				else if(sign2 == ROCK)
				{
					return 'T';
				}
				else
				{
					return 'L';
				}
				
			}
			
			else if(sign1 == SCISSORS)
			{
				if(sign2 == PAPER)
				{
					return 'W';
				}
				else if (sign2 == SCISSORS)
				{
					return 'T';
				}
				else
				{
					return 'L';
				}
			}
			
			else if(sign1 == PAPER)
			{
				if(sign2== ROCK)
				{
					return 'W';
				}
				else if(sign2 == PAPER)
				{
					return 'T';
				}
				else
				{
					return 'L';
				}
			}
			
			else
			{
				//something probably went wrong
				return 'X';
			}
			
			
		}
		
		public int getRounds()
		{
			return rounds;
			
		}
		
		public int getHandSign()
		{
			return (int)(Math.random()*3)+1;
		}
		
		public void printHandSign(int sign)
		{
			switch (sign)
			{
				case ROCK:
				{
					System.out.println("Rock");
					break;
				}
				
				case PAPER:
				{
					System.out.println("Paper");
					break;
				}
				
				case SCISSORS:
				{
					System.out.println("Scissors");
					break;
				}
			}
		}
		
		
		
		
		
	}

}
