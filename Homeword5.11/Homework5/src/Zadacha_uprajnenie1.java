import java.util.Scanner;
public class Zadacha_uprajnenie1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		long number = scanner.nextInt();
		if(number >= 10 && number <= 30000){
			long result = sum(number);
			print(result);
		} else{
			System.out.println("Error!");
		}
		
	}
	public static long sum(long k){
	if(k >= 1 && k <= 30000){
			return k + sum(k-1);	
		} else{
			return 0;
		}
	}
	
	public static void print(long result){
	System.out.println("The result is : " + result);
		
	}
}