package lab03;

public class Operand {

	protected double one;
	protected double two;
	
	public void setOne(double one){
		this.one = one;
	}
	
	public double getOne(){
		return this.one;
	}
	public void setTwo(double two){
		this.two = two;
	}
	
	public double getTwo(){
		return this.two;
	}
	
	public double add(){
		return one += two;
	}
	
	public double minus(){
		return one -= two;
	}
	
	public double times(){
		return one * two;
	}
	
	public double divide(){
		return one / two;
	}
}
