
public class HumanTest {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		System.out.println("h1's Health:" + h1.health);
		
		Wizard w1 = new Wizard();
		System.out.println("w1's Health:" + w1.health);
		System.out.println("w1's Intelligence:" + w1.intelligence);
		
		Ninja n1 = new Ninja();
		System.out.println("n1's Health:" + n1.health);
		System.out.println("n1's Stealth:" + n1.stealth);
		
		Samurai s1 = new Samurai();
		System.out.println("s1's Health:" + s1.health);
		
		w1.heal(n1);
		System.out.println("w1 healed n1. n1 new health: " + n1.health);
		
		w1.fireball(s1);
		System.out.println("w1 shot fireball at s1. s1 new health: " + s1.health);
		
		n1.steal(s1);
		System.out.println("n1 stole health from s1. s1 new health: " + s1.health);
		System.out.println("n1 new health: " + n1.health);
		
		n1.runAway();
		System.out.println("n1 ran away. n1 new health: " + n1.health);
		
		s1.deathBlow(w1);
		System.out.println("s1 dealed deathblow to w1. w1 new health: " + w1.health);
		System.out.println("s1 new health: " + s1.health);
		
		s1.meditate();
		System.out.println("s1 meditated. s1 new health: " + s1.health);
		
		System.out.println("How many samurais are there: " + s1.howMany());
		

	}

}
