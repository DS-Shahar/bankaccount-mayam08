
public class Main {
	public static void main(String[] args) {
		BankAccount lisa = new BankAccount(1000, -1000, "lisa");
        BankAccount bob = new BankAccount(1000, -1000, "bob");
//		System.out.println(acct1.getBalance());
		
//		acct1.withdraw(300);
//		System.out.println(acct1.getBalance());
//
	//	acct1.deposit(300);
//		System.out.println(acct1.getBalance());
//
		System.out.println(bob);
		System.out.println(lisa);
		
		lisa.transfer(bob, 500);
		
		System.out.println(bob);
		System.out.println(lisa);
		
		boolean transfer = lisa.transfer(bob, 1600);
		
		if (transfer == false) {
			System.out.println("not enough money in account");
		}
		
	}
}
