class FactorialCalculator{
	public static void main (String[] args) throws Exception{
		int n = 15;
		System.out.println(Factorial(n));
	}
	
	public static long Factorial(int n){
		if (n > 20 || n < 0) throw new IllegalArgumentException("Illegal input!");
		else if (n == 1 || n == 0) {
			return 1;
		}
		else{
			return n*Factorial(n-1);
		}
	}
}
