
public class Gorilla extends Mammal{
	
	public void throwSomething() {
		System.out.println("Gorrila threw something");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Gorrila has eatan a banana");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorrila has climbed a tree");
		energyLevel -= 10;
	}

}
