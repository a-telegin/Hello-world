class EvenRangePrinter{
	public static void main(String[] args) throws Exception{
		int first = 1;
		int last = 50;
		printEven(first, last);
	}
	static void printEven(int first, int last){
		int arrLength = 0;
		if (first > last) { //blank }
		else if(first == last){
			throw new IllegalArgumentException("First and last numbers are equal!");
		}
		else {
			/* if both are even numbers we need one more element in array */
			/* if either of them is even or both are odd, we don't */
			arrLength = (isEven(first) && isEven(last)) ? (last - first) / 2 + 1 : (last - first + 1) / 2;
			
			int arr[] = new int[arrLength];
			for (int i=0; i < arrLength; i++){	
				arr[i] = (isEven(first)) ? (first + 2*i) : (first + 1 + 2*i);
				System.out.println(arr[i]);
			}
		}
	}
	static boolean isEven(int number) { return number%2 == 0; }
}
