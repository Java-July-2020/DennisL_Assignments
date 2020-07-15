
public class Wizard extends Human{
	
	public Wizard() {
		health = 50;
		intelligence = 8;
	}
	
	public void heal(Human player) {
		player.health += this.intelligence;
	}
	
	public void fireball(Human player) {
		player.health -= this.intelligence*3;
	}

}
