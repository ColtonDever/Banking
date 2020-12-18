package lab03;

public class CAccount implements Account {

	protected static final double CHARGE = 0.05;
	protected double balance;

	public CAccount(double balance){
		this.balance = balance;
	}

	public double totalBalance(){
		
		return balance -=(balance*CHARGE);
	}
}
