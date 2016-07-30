class RangePrinter{
	public static void main(String[] args) throws Exception{
		int first = 4;
		int last = 1;
		
		printRange(first, last);
	}
	static void printRange(int first, int last){
		int arrLength = 0;
		if (first == last) throw new IllegalArgumentException("Numbers are equal!");
		else {
			/* Array length calculation */
			arrLength = (first > last) ? (first - last + 1) : (last - first + 1);
			
			int arr[] = new int[arrLength];
			if (first < last){
				for (int i=0; i < arrLength; i++){	
					arr[i] = first + i;
					System.out.println(arr[i])	;
				}
			}
			else {
				for (int i = 0; i < arrLength; i++){
					arr[i] = first - i;
					System.out.println(arr[i]);
				}
			}	
		}
	}
}
