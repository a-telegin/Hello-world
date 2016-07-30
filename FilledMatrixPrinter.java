class FilledMatrixPrinter{
	public static void main (String[] args) throws Exception{
		int rows = 15;
		int cols = 20;
		int filler = -1;
		MtxPrint(rows, cols, filler);
	}
	
	static void MtxPrint(int rows, int cols, int filler){
		if (rows < 0 || cols < 0) throw new IllegalArgumentException("Illegal input!");
		else{
			int arr[][] = new int[rows][cols];
			for (int i = 0; i < rows; i++){
				for (int k = 0; k < cols; k++){
					arr[i][k] = filler;
					System.out.print(arr[i][k]+" ");
				}
				System.out.print("\n");
			}
		}
	}
}
