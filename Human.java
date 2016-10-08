
public class Human 
{
	private int bodyHeat;
	private int hunger;
	private int food;
	private int wood;
	private int stamina;
	private int numOfItems;
	private int miles;
	private final int maxItems = 10;
	
	public Human()
	{
		bodyHeat = 100;
		hunger = 100;
		food = 5;
		wood = 5;
		stamina = 100;
		miles = 0;
		numOfItems = 0; // add up the food and wood
	}
	
	//prints status
	public String toString()
	{
		return "Miles:  " + this.getMiles() + "\nBody heat: " + this.getBodyHeat() + "\nHunger: " + this.getHunger() + "\nStamina: " + this.getStamina() + 
				"\nNumber of Items: " + this.getNumOfItems() + "\nWood: " + this.getWood() + "\nFood: " + this.getFood();
	}
	
	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	//check for number of items
	//returns boolean
	public boolean overItems()
	{
		if(this.getNumOfItems() > 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//adds the number of wood and food
	public int getNumOfItems()
	{
		return this.getFood() + this.getWood();
	}
	
	//decrementer for food
	public void decrementFood(){
		this.setFood(this.getFood()-1);
		
	}
	
	//incrementer for food
	public void incrementFood(){
		this.setFood(this.getFood()+1);
	}

	//decrement for wood
	public void decrementWood()
	{
		this.setWood(this.getWood()-1);
		
	}
	
	//increment for wood
	public void incrementWood()
	{
		this.setWood(this.getWood()+1);
	}
	
	
	
	public int getBodyHeat() {
		return bodyHeat;
	}

	public void setBodyHeat(int bodyHeat) {
		this.bodyHeat = bodyHeat;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}


	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public int getMaxItems() {
		return maxItems;
	}

	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}
	
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
}
