import java.util.Scanner;
class NameToId{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
		System.out.println(NameToId(name));
	}
	static int NameToId(String name){
		int id = 0;
		switch (name){
			case "Car": {id = 0; break;}
			case "Lego": {id = 1; break;}
			case "Doll": {id = 2; break;}
			case "Puzzle": {id = 3; break;}
			default : throw new IllegalArgumentException("No such name!");
		}
		return id; 
	}
}
