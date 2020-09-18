package inheritance;

public class Factorials {
	
	public static void main(String[] args) {
		
		long num = 1;
		
		for(int counter = 1; counter <= 20; counter++) {
			
			num *= counter;
		}
		
		System.out.printf("this is the result:%d%n", num);
	}

}
