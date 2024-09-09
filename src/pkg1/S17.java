package pkg1;

class Bank3 {
	private double balance;
	Bank3(double amount){
		this.balance=amount;
	}
	
	public void addAmount(double amount) {
		balance = balance+amount;
		System.out.println("Balance is : "+balance);
	}
	public void displayBalance() {
		System.out.println("Balance is : "+balance);
	}
	public void withdrawAmount(double amount) {
		if(balance<0 | balance < amount) {
			System.out.println("Insufficient Funds");
		}
		else {
			balance=balance-amount;
			System.out.println("Balance is: "+balance);
		}
	}
}
public class S17{
	public static void main(String[] args) {
		Bank3 bank3 = new Bank3(500.0);
		bank3.displayBalance();
		bank3.addAmount(200.0);
		bank3.withdrawAmount(300.0);
	}
}
