package inheritance;
import java.security.SecureRandom;
public class RandomInteger {
	
	public static void main(String[] args) {
		
	SecureRandom randomNumber = new SecureRandom();
	
	for(int counter = 1; counter <= 20; counter++) {
	
		int number = 1 + randomNumber.nextInt(6);
		System.out.printf("%d   ", number);
		
		if(counter % 5 == 0)
			System.out.println();
		
	}
		
	}

}
