package inheritance;

public class FreeTime {
	
	public static void main(String[] args) {
	
//		
//	String	[] gadans = {"ganiu","grace","tope","bolaji","joanna"};
//	
//	for(int counter = 0; counter < gadans.length; counter++) {
//	//	System.out.println(gadans[counter]);
//		
//		System.out.printf("%d%10s%n", counter, gadans[counter]);
//	}
		
		int [] figure = {25, 30, 35, 40, 45,50};
		int total = 0;
		
		for(int index = 0; index < figure.length; index++) {
			total += figure[index];
			
		}
		System.out.printf("the total of the summation: %d%n", total);

	}

}
