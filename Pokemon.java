
public class Pokemon 
{
	private String name;
	private String type;
	private int HP;
	private int attack;
	private int rarity; //rarity in percentage if you will be bale to get the pokemon
	
	public Pokemon()
	{
		name = "magikarp";
		type = "water";
		HP = 20;
		attack = 0;
		rarity = 0;
	}
	
	public Pokemon (String name, String type, int HP, int attack, int rarity)
	{
		this.name = name;
		this.type = type;
		this.HP = HP;
		this.attack = attack;
		this.rarity = rarity;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public String toString()
	{
		return "**********\nName: " + name + "\nType: "+ type + "\nHP: " + HP + "\nAttack: " + attack 
				+ "\n**********";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
}
