import java.util.Scanner;


public class Zadacha7{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = input.nextInt();
		StringBuilder Permutation = new StringBuilder();
	
		for(int i = 1; i <= a; i++){			
			Permutation.append(i);
		}
		Permutation("", Permutation.toString());

	}
	
	public static void Permutation(String string, String string1) {
		if(string1.length() == 0){			
		
			System.out.println(string);
	
		}
		else {
			for(int i = 0; i < string1.length(); i++){			
				Permutation(string + string1.charAt(i),
				string1.substring(0, i) + string1.substring(i + 1));
			}
		}
	}
}
