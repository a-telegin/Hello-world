import java.lang.Math;
public class RangeStepped {
	public static void main(String[] args){
		int first = -18;
		int last = -1;
		int step = 2;
		
		printRange(first, last, step);
	}
	static void printRange(int first, int last, int step){
		int arrLength = 0;
		boolean isLegalInput = (first != last && step > 0 && step < Math.max(Math.abs(first),Math.abs(last)));
		
		if (isLegalInput) {
			/* Array length calculation */
			arrLength = (first > last) ? ((first - last + 1) / step) : ((last - first + 1) / step);
			
			/* Filling in array and printing it out in the same loop */
			int arr[] = new int[arrLength];
			if (first < last){
				for (int i=0; i < arrLength; i++){	
					arr[i] = first + i*step;
					System.out.println(arr[i]);
				}
			}
			else {
				for (int i = 0; i < arrLength; i++){
					arr[i] = first - i*step;
					System.out.println(arr[i]);
				}
			}	
		} 
		else throw new IllegalArgumentException("Illegal input numbers!");
	}
}
