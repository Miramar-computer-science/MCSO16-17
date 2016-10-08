import java.util.ArrayList;

public class Trainer 
{
	private ArrayList<Pokemon> pokemons;
	private Pokemon starter;
	private String name;
	private int miles;
	private int balls = 10;
	private int potions;// let them start with 10
	private int level;
	private boolean nearPark;
	private int probOfCatching; // in percent, and only when walking
	private int XP;
	
	
	public Trainer()
	{
		pokemons = new ArrayList<Pokemon>();
		starter = new Pokemon();
		pokemons.add(starter);
		name = "ash";
		miles = 0;
		level = 1;
		potions = 10;
		XP = 0;
		nearPark = false;
		if(nearPark == false)
		{
			probOfCatching = 10;
		}
		else
		{
			probOfCatching = 50;
		}
	}
	
	public Trainer(Pokemon starter, String name)
	{
		pokemons = new ArrayList<Pokemon>();
		this.starter = starter;
		pokemons.add(starter);
		this.name = name;
		miles = 0;
		level = 1;
		potions = 10;
		XP = 0;
		nearPark = false;
		if(nearPark == false)
		{
			probOfCatching = 10;
		}
		else
		{
			probOfCatching = 50;
		}
	}
	
	public int getXP() {
		return XP;
	}

	public void setXP(int xP) {
		XP = xP;
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public Pokemon getStarter() {
		return starter;
	}

	public void setStarter(Pokemon starter) {
		this.starter = starter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getPotions() {
		return potions;
	}

	public void setPotions(int potions) {
		this.potions = potions;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isNearPark() {
		return nearPark;
	}

	public void setNearPark(boolean nearPark) {
		this.nearPark = nearPark;
		if(nearPark == false)
		{
			this.probOfCatching = 10;
		}
		else
		{
			this.probOfCatching = 50;
		}
	}

	public int getProbOfCatching() {
		return probOfCatching;
	}

	public void setProbOfCatching(int probOfCatching) {
		this.probOfCatching = probOfCatching;
	}

	public String toString()
	{
		return "Trainer: " + name + "\nMiles: " + miles + "\nXP: " + XP + "\nlevel: " + level + "\nPotions: " + potions + "\nPokeballs: " + balls;
	}
	
	public void tradePokemon(Pokemon owned, Pokemon other)
	{
		for(int i = 0; i < pokemons.size(); i++)
		{
			if(owned.getName().equals(pokemons.get(i).getName()))
			{
				pokemons.set(i, other);
				break;
			}
		}
	}
	
	public void incrementLevel()
	{
		this.level++;
	}
	
	public void incrementMiles(int milesWalked)
	{
		this.miles += milesWalked;
	}

	public void useBall()
	{
		if(this.getBalls() == 0)
		{
			System.out.println("You're out of poke balls, go buy some more!!!");
			
		}
		else
		{
			this.balls--;
		}
		
		
	}
	
	public void addPokemon(Pokemon other)
	{
		this.pokemons.add(other);
	}
	
	public void incrementXP(int XP)
	{
		this.XP += XP;
	}
	

	
	
}
