import java.util.Scanner;
public class Zadacha2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Enter a name:");
		 name = scanner.next();
		Function(name);
	}
	public static void Function(String name){
		System.out.println("Greeting, " + name);
		
		

	}

}
