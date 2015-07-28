import java.util.Scanner;
public class Zadacha6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter factoriel" );
		int num = scanner.nextInt();
		int count = 0;
		int sum = 1;
		
		if (num == 0){
			System.out.println("Error");
			
		}
		sum = Factoriel(num, count, sum);
		System.out.println("The result is:" + sum);
	}
	
	public static int Factoriel(int num, int count, int sum){
		if(num == (count+1)){
			return sum*num;
		}
		sum*=(count+1);
		
		count++;
		sum = Factoriel(num, count, sum);
		return sum;
		
			}
	

	}


