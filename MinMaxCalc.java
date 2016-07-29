/**
*@author: A.Telegin
*created 29/07/2016
*/
class MinMaxCalculator{

	public static void main(String[] args){
		int a = 1000;
		int b = 2000;
		
		intmaxmin(a,b);
	}
	static int intmaxmin(int a,int b){
		if (a == b){
			System.out.println(" a = b ");
		}
		else {
			int max;
			int min;
			max = (a > b) ? a : b;
			min = (a < b) ? a : b;
			System.out.println(" max is "+ max);
			System.out.println(" min is "+ min);
		}
		return 0;  
	}

}
