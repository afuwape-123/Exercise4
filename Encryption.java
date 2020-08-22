package inheritance;
import java.util.Scanner;
public class Encryption {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		
		int fourthNum = number % 10;
		number = number/10;
		
		int thirdNum = number % 10;
		number = number/10;
		
		int secondNum = number % 10;
		number = number/10;
		
		int firstNum = number % 10;
		
		if(number >= 0) {
			fourthNum = ((fourthNum + 7)% 10);
			thirdNum = ((thirdNum + 7)% 10);
			secondNum = ((secondNum + 7)% 10);
			System.out.printf("Encrypt: "+thirdNum+" "+fourthNum+" "+firstNum+" "+secondNum+" ");
			System.out.println();
		}
		
		fourthNum = (((fourthNum + 10)- 7) % 10);
		thirdNum = (((thirdNum + 10)- 7) % 10);
		secondNum = (((secondNum + 10)- 7 )% 10);
		System.out.printf("decrypt: "+firstNum+" "+secondNum+" "+thirdNum+" "+fourthNum+" ");
	}

}
