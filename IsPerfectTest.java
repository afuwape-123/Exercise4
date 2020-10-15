package inheritance;
public class IsPerfectTest {
	
	public static void main(String[] args) {
		
		for(int j = 1; j < 1000; j++) {
		
		boolean result = IsPerfect.isPerfectNum(j);
		
		if(result == true)
			System.out.println(j);
	//	System.out.println(result);
	}
	}
	

}
