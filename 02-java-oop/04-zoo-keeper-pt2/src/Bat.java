public class Bat extends Mammal {

	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Woosh Woosh..");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("so- well, never mind");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("fire...psh...");
		energyLevel -= 100;
	}
}
