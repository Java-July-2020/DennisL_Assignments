
public class Human {
	int strength;
	int intelligence;
	int stealth;
	int health;
	
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
