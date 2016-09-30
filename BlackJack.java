import java.util.*;

// disclaimer: I forgot the rule that Ace was a 1 or 11 :(
// I also forgot how to play while writing the summary of the program. :(((((((
//also, the "ai" (artificial intelligence) is kind of dumb, so it stops drawing after its sum is past 15. 
//This was longer than I thought jeez
public class BlackJack 
{
	public static void main(String[] args)
	{
		//declarations
		int userFirstCard, userSecondCard, computerFirstCard, computerSecondCard;//first deal cards
		int userSum , aiSum ;//the sum of each player's hand
		Scanner keyboard; 
		String command;
		int newCard;
		
		//Initialization
		keyboard = new Scanner(System.in);
		command = "hit me";
		userFirstCard = (int)(Math.random()*11)+1;//sets first card to a random card
		userSecondCard = (int)(Math.random()*11)+1;//sets second card to a random card
		computerFirstCard = (int)(Math.random()*11)+1;
		computerSecondCard = (int)(Math.random()*11)+1;
		userSum = userFirstCard + userSecondCard;
		aiSum = computerFirstCard + computerSecondCard;
		while(aiSum == 21)
		{// so the ai doesn't automatically win hehe
			computerFirstCard = (int)(Math.random()*11)+1;
			computerSecondCard = (int)(Math.random()*11)+1;
			aiSum = computerFirstCard + computerSecondCard;
		}
		
		
			System.out.println("User turn");
			printHand(userFirstCard, userSecondCard);
			System.out.println("Computer's first card: " + computerFirstCard);
			//user's turn
			while(command.equalsIgnoreCase("hit me"))
			{
				System.out.print("\nEnter a command: ");
				command = keyboard.nextLine();
				
				if(command.equalsIgnoreCase("hit me"))
				{
					newCard = (int)(Math.random()*11) +1;
					userSum += newCard;
					if(userSum > 21)
					{
						System.out.println("You drew a " + newCard);
						System.out.println("You Busted!!!");
						System.out.println("Your sum before losing was " + userSum);
						System.exit(0);
					}
					else if(userSum == 21)
					{
						System.out.println("You drew a " + newCard);
						System.out.println("You have reached 21. you should probably stay");
					}
					else if(userSum < 21)
					{
						System.out.println("You drew a " + newCard);
						System.out.println("Your sum is " + userSum);
					}
				}
				else if(command.equalsIgnoreCase("stay"))
				{
					command = "who cares";
					break;//do something
				}
				else
				{
					System.out.println("enter something correct!!! Replay!");
					System.exit(0);
				}
			}//end while that does user's turn
			
			System.out.println("\n\nAI turn\n.....");
			
			
				
			while(aiSum < 15)
			{
				//ai turn
				aiSum += (int)(Math.random()*11)+1;
				if(aiSum == 21)
				{
					System.out.println("Computer has Won");
					System.out.println("Computer won with a sum of 21. While, you won with a sum of " + userSum);
					System.exit(0);
				}
				else if(aiSum < 21)
				{
					System.out.println("Computer has drawn a card, but has not busted");
				}
				else
				{
					System.out.println("Computer has busted!!! Congrats, you win");
					System.out.println("Computer busted with a sum of " + aiSum + ". While, you won with a sum of " + userSum);
					System.exit(0);
				}
			}
			
			System.out.println("Computer's Sum is " + aiSum);
			//end of game
			
			System.out.println("**************************\nResult:");
			
			
			if(userSum > aiSum && userSum <= 21)
			{
				System.out.println("You won with a sum of " + userSum + ". While the ai had a sum of " + aiSum);
			}
			else if (aiSum > userSum && aiSum <= 21)
			{
				System.out.println("You lost with a sum of " + userSum + ". While the ai had a sum of " + aiSum);
			}
			else if(userSum == aiSum)
			{
				System.out.println("It's a tie!!!");
				System.out.println("Both players had a sum of " + userSum);
				System.exit(0);
			}
	
		
	}//end main
	
	protected static void printHand(int first, int second) // an example of encapsulation! wala
	{
		System.out.println("User's first card: " + first);
		System.out.println("User's second card: " + second);
		System.out.println("Sum = " + (first + second)); //explain parenthesis thingy
		
	}
	
}
