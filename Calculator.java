package lab03;

public class Calculator extends Operand implements Operations{

	public static void main(String args []){
		
		System.out.println();
	}
	public double plus() {
		return super.getOne()+super.getTwo();
	}

	public double minus() {
		return super.getOne()-super.getTwo();
	}

	public double times() {
		return super.getOne()*super.getTwo();
	}

	public double divide() {
		return super.getOne()/super.getTwo();
	}
	
}