package ganiu_project;

public class Array_Test {
	
	public static void main(String[]args) {
		
		int [] array = new int[10];
		
		System.out.printf("%s%8s%n", "index", "value");
		
		for(int counter = 0; counter < 9; counter++) {
			
		if(counter == 7 || counter == 9 )
			
			continue;
	
		
			
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}
