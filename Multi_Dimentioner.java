package ganiu_project;

public class Multi_Dimentioner {
	
	public static void main(String[] args) {
		
		int made[][] = {{1, 2, 3, 4}, { 5, 6, 7}, { 8, 9, 10},{ 11, 12, 13},{14, 15, 16}};
		
		for(int row = 0; row < made.length; row++) {
			
			for(int col = 0; col < made[row].length;col++) {
				
				System.out.print(made[row][col]+ " ");
			}
			
			System.out.println();
		}
	}

}
