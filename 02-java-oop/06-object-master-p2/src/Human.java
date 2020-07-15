
public class Human {
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;
	
	public Human(){
		strength = 3;
		intelligence = 3;
		stealth = 3;
		health = 100;
	}
	
	public void attack(Human player) {
		player.health -= this.strength;
	}

}
