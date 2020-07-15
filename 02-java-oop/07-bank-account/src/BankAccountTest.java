
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount bA = new BankAccount();
		System.out.println(bA.accountNumber);
		
		bA.depositMoney("saving", 10.00);
		System.out.println(bA.getSavingBalance());
		
		bA.withdrawMoney("saving", 5.0);
		System.out.println(bA.getSavingBalance());
		
		bA.withdrawMoney("saving", 6.0);
		
		bA.depositMoney("checking", 30.00);
		System.out.println(bA.getCheckingBalance());
		
		bA.withdrawMoney("checking", 5.0);
		System.out.println(bA.getSavingBalance());
		
		bA.totalMoney();
		

	}

}
