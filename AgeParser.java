import java.io.*;
public class AgeParser{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sAge = reader.readLine();
		int Age = Integer.parseInt(sAge);

		System.out.println(checkAge(Age));
	}
	static int checkAge(int Age){
		if (Age < 1 || Age > 120) 
			throw new IllegalArgumentException("Age must not be lower than 1 and greater than 120");
		return Age;
	}
}
