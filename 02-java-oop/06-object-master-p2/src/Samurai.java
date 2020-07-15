
public class Samurai extends Human{
	static int samuraiCount = 0;
	
	public Samurai() {
		health = 200;
		samuraiCount++;
	}
	
	public void deathBlow(Human player) {
		player.health = 0;
		this.health /= 2;
	}
	
	public void meditate() {
		this.health = this.health + (this.health/2);
	}
	
	public int howMany() {
		return samuraiCount;
	}

}
