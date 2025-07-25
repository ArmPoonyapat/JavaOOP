package lab4_1;

public class BankAccount {
	
	public String name;
	public double balance;
	
	private Date date;
	
	public BankAccount(String name) {
		this.name = name;
		this.balance = 0;
		this.date = new Date(25,7,2025);
	}
	
	public BankAccount( String name , double amount, Date date) {
		this.name = name;
		this.balance = amount;
		this.date = date;	
	}
	
	public void deposit(double amount) {
			this.balance = balance+amount;
		}
		
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			this.balance = balance - amount;
			return true;
		}
		return false;
	}
	
	public void transfer( BankAccount other, double amount) {
		if(balance >= amount ) {
			other.balance = other.balance + amount;
			this.balance -= amount;
		}
	}
	
	
	
/*	public void transfer( BankAccount other, double amount) {
		if(this.withdraw(amount) ) {
			other.balance = other.balance + amount;
		}
	}*/
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getInfo() {
		return this.name+""+this.date.getDay()+""+this.date.getMonth()+""+this.date.getYear();
	}

	public static void main(String[] args) {

	}

}
