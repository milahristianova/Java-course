import java.util.Scanner;
public class Zadacha4 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = scanner.nextInt();
		
	Function(num);
	}
	
		public static void Function(int num){
			if(num%2 == 0){
				System.out.println("The number is even");
			}
			else{
				System.out.println("The number is odd");
				
			}
		}

	}


