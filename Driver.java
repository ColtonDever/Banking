package lab03;

public class Driver {

	public static void main (String args []){
		
		int sCounter = 0;
		int cCounter = 0;
		
		Account[] ac = new Account[5];
		ac[0] = new SAccount(250.00);
		ac[1] = new CAccount(2500.00);
		ac[2] = new SAccount(270.00);
		ac[3] = new CAccount(3500.00);
		ac[4] = new SAccount(1250.00);
		
	
	for(int i = 0; i<ac.length; i++){
		System.out.println(ac[i].totalBalance());
		if(ac[i] instanceof SAccount) 
			sCounter++;
		else
			cCounter++;
	}
	
	System.out.println();
}
}