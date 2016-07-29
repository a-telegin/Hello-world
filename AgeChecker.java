public class AgeChecker{
	
	public static void main(String[] args){
		int Age = 1; //0, 120, 121, -1
		System.out.println(isAge(Age));
	}
	static boolean isAge(int Age){
		return (Age < 1 || Age > 120) ? false : true;
	}
}
