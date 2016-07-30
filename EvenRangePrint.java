class EvenRangePrinter{
	public static void main(String[] args) throws Exception{
		int first = 1;
		int last = 5;
		
		printEven(first, last);
	}
	static void printEven(int first, int last){
		int arrLength = 0;
		
		if (first > last) {
		}
		else if(first == last){
			throw new IllegalArgumentException("First and last numbers are equal!");
		}
		else {
			/* if both are even numbers we need one more element in array */
			if (isEven(first) && isEven(last)){
				arrLength = (last - first) / 2 + 1; 
			}
			/* if either of them is even or both are odd */
			else{
				arrLength = (last - first + 1) / 2; 
			} 	
			int arr[] = new int[arrLength]; 
		
			for (int i=0; i < arrLength; i++){	
				if (isEven(first)){
					arr[i] = first + 2*i;
				}
				else {
					arr[i] = first + 1 + 2*i;
				}
				System.out.println(arr[i]);
			}
		}
	}
	
	static boolean isEven(int number){
		return number%2 == 0;
	}
}
