package lab03;

public class SAccount implements Account{

	double interest;
	double balance;
	
	public SAccount(double balance){
		this.balance = balance;
	}
	
	public double totalBalance(){
		return balance += interest;
	}
	
}
