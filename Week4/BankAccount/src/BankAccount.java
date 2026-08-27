public class BankAccount {

	public static void main(String[] args) {
		Account firstAccount = new Account("1001", "Alice");

		System.out.println("Positive deposit: " + firstAccount.deposit(500));
		System.out.println("Zero deposit: " + firstAccount.deposit(0));
		System.out.println("Negative deposit: " + firstAccount.deposit(-50));
		System.out.println("Valid withdrawal: " + firstAccount.withdraw(200));
		System.out.println("Excessive withdrawal: " + firstAccount.withdraw(400));
		System.out.println(firstAccount);

		Account secondAccount = new Account("1002", "Bob", 1000);
		secondAccount.deposit(250);
		System.out.println(secondAccount);
		System.out.println("Accounts are independent: " + firstAccount.getBalance() + ", "
				+ secondAccount.getBalance());
	}
}

