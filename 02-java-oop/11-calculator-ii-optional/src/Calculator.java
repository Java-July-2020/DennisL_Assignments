import java.util.*;
public class Calculator implements java.io.Serializable{
	
	private ArrayList<Double> numbers = new ArrayList<>();
	private ArrayList<String> oper = new ArrayList<>();
	private double result = 0;
	private int containsEqual = 0;

	
	public Calculator() {
		
	}
	
	public void performOperation(double number) {
		this.numbers.add(number);
//		System.out.println(number + " Added.");
	}
	
	public void performOperation(String operation) {
			this.oper.add(operation);
//			System.out.println(operation + " Added.");
	}

	public void getResults() {
		
		if (oper.get(oper.size()-1).equals("=")) {
			System.out.println("How many equal signs: " + containsEqual);
			System.out.println("We can start caculating");
			
			//Calculate multi & div first
			for (int i = 0; i < oper.size(); i++) {
				if (oper.get(i).equals("*")) {
					result = result + (numbers.get(i) * numbers.get(i+1));
				}
				if (oper.get(i).equals("/")) {
					result = result + (numbers.get(i) / numbers.get(i+1));
				}
			}
			
			//Calculate plus & minus
			for (int i = 0; i < oper.size(); i++) {
				if (oper.get(i).equals("+")) {
					result = result + numbers.get(i);
				}
				if (oper.get(i).equals("-")) {
					result = result - numbers.get(i);
				}
			}
			System.out.println(result);
			oper.clear();
			numbers.clear();
		}
		else {
			System.out.println("We cannot start caculation as there is no '=' operation added");
		}
		
		containsEqual = 0;
	}

}
