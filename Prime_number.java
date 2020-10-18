package ganiu_project;

public class Prime_number {

	public static void main(String[] args) {
		
	for(int i = 1; i <= 1000; i++) {
		
		int factor = 0;
		
		for(int j = 1; j <= i; j++) {
			
			if(i % j == 0)
				
				factor++;
			
		}
		if(factor == 2)
			System.out.println(i);
	}
		
	
		
		}

	} 