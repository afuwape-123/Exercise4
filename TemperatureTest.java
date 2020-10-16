package inheritance;
import java.util.Scanner;
public class TemperatureTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1 to convert to celsius or enter 2 to convert to fahrenheit: ");
		int choice = input.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter the num:  ");
			double num = input.nextDouble();
			double value = Temperature.celsius(num);
			System.out.println(value);
		}
		
		if(choice == 2) {
			System.out.print("Enter the num: ");
			double num2 = input.nextDouble();
			double value2 = Temperature.fahrenheit(num2);
			System.out.println(value2);
		}
	}

}
