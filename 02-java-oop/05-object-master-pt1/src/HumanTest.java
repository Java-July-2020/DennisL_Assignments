
public class HumanTest {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		System.out.println("h1's Health:" + h1.health);
		
		Ninja n1 = new Ninja();
		System.out.println("n1's Health:" + n1.health);
		
		Wizard w1 = new Wizard();
		System.out.println("w1's Health:" + w1.health);
		
		Samurai s1 = new Samurai();
		System.out.println("s1's Health:" + s1.health);
		
		n1.attack(w1);
		System.out.println("w1's Health:" + w1.health);
	}

}
