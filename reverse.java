package lab03;
import java.util.*;
public class reverse {
	
	public static void main(String args []){
		int num = 0;
		int rem;
		int rev = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		rem = keyboard.nextInt();
		
		while(rem>0){
			rem = rem%10;
			
			rem = (rem*10+rev);
			
			num = num/10;
		}
		System.out.println(num);	
	}
	

}
