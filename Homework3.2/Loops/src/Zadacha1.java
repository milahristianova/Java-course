import java.util.Scanner;
public class Zadacha1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n=");
		int n = input.nextInt();
		System.out.println("Enter m=");
		int m = input.nextInt();
		int result = 1;
		for (int i = 0; i< m; i++){
			result *= n;
		}
			System.out.println("n^m = " + result);
			input.close();
		}
		


	}



	


