package inheritance;

public class CheckSmallest {
	
	public int theSmallestNum(int x, int y, int z) {
	int figure= x;
	int smallest = 0;
	int smallestNum = 0;
	
	if(figure > smallest) {	
	 smallestNum += figure;
	figure = y;
	}
	
	if(figure < smallestNum) {
		smallestNum = figure;
		figure = z;	
	}
	if(figure < smallestNum) {
		smallestNum = figure;
	}
	return smallestNum;
}	
	
	

}
