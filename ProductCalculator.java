package ganiu_project;
import java.util.Scanner;
public class ProductCalculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double price = 0.0;
		double totalSales = 0.0;
		double retailPrice = 0.0;
		
		System.out.print("enter the product number");
		int productNumber = input.nextInt();
		
		switch(productNumber) {
		case 1:
			price = 2.98;
			break;
			
		case 2:
			price = 4.50;
			break;
			
		case 3:
			price = 9.98;
			break;
			
		case 4:
			price = 4.49;
			break;
			
		case 5:
			price = 6.87;
			break;
			
			default:
				break;
		}		
			
				while(productNumber > 0) {
					System.out.print("Enter the quantity sold: ");
					int quantity = input.nextInt();
					
					 retailPrice = price * quantity;
					
					 totalSales += retailPrice;
					
					System.out.print("enter the product number");
					productNumber = input.nextInt();
				
				}
					
				System.out.printf("the total sale is: %.2f%n", totalSales );
				
				
		
		
	}

}
