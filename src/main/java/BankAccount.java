
public class BankAccount {
	private int balance = 0;
	private int minBalance = -5000;
	private String owner;
//----------------------
	
	public BankAccount(int balance) {
        this.balance = balance;
    }
	
	public BankAccount(int balance, int minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
    }
	
	public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner = owner;
    }
//----------------------
	
	public int getBalance() {
		return balance;
	}
	
	public int getMinBalance() {
		return minBalance;
	}
//----------------------
	
	public void setBalance(int newBalance) {
		if(newBalance > minBalance)
			this.balance = newBalance;
		else
			System.out.println("bigger than minimum");
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public boolean withdraw(int amount) {
        if (this.balance - amount < minBalance)
            return false;
        this.balance = this.balance - amount;
        return true;
    }
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	public boolean transfer(BankAccount target, int amount) {
	      if (withdraw(amount)) {
	    	  target.deposit(amount);
	    	  return true;
	      }
	      else
	    	  return false;
	}
	
	public String toString() {
        return "balance of " + owner + ": " + balance;
    }
	
}