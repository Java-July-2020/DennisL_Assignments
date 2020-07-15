
public class BankAccount {
	protected String accountNumber;
	protected double checkingBalance;
	protected double savingBalance;
	public static int accountTotal = 0;
	public static double balanceStored = 0;
	
	public BankAccount() {
		accountNumber = randomAccountNum();
		accountTotal++;
	}
	
	private static String randomAccountNum() {
        StringBuilder word = new StringBuilder(10); 
        String AlphaNumericString = "0123456789";
        for (int i = 0; i < 10; i++){
            int index = (int)(AlphaNumericString.length() * Math.random());
            word.append(AlphaNumericString.charAt(index));
        }
        String sword = String.valueOf(word.toString());
        return sword;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public void depositMoney(String account, double amount) {
		if (account.equals("checking")) {
			System.out.println(amount + " Added to Checking Account");
			checkingBalance += amount;
		}
		
		if (account.equals("saving")) {
			System.out.println(amount + " Added to Saving Account");
			savingBalance += amount;
		}
	}
	
	public void withdrawMoney(String account, double amount) {
		if (account.equals("checking")) {
			if (checkingBalance - amount >= 0) {
				System.out.println(amount + " Withdrawed to Checking Account");
				checkingBalance -= amount;
			}
			else {
				System.out.println("Checking account has: " + checkingBalance + ". Can't"
						+ " withdraw requested amount: " + amount);
			}

		}
		
		if (account.equals("saving")) {
			if (savingBalance - amount >= 0) {
				System.out.println(amount + " Withdrawed to Saving Account");
				savingBalance -= amount;
			}
			else {
				System.out.println("Saving account has: $" + savingBalance + ". Can't"
						+ " withdraw requested " + amount);
			}

		}
	}
	
	public void totalMoney() {
		System.out.println("Total amount between Checking & Savings Account: " + (savingBalance + checkingBalance));
	}
}
