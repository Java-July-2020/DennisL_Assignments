
public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		c1.performOperation(10.5);

		c1.performOperation("+");

		c1.performOperation(5.2);

		c1.performOperation("*");

		c1.performOperation(10);

		c1.performOperation("=");

		c1.getResults();

	}
}
