import java.util.Scanner;
public class Zadacha6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");
		System.out.println("enter five numbers: ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int num;
		for (int i = 1; i <= 5; i++){
			num = scanner.nextInt(); 
			if(num > max){
				max = num;
			}
			if(num < min){
				min = num;
				
			}
		}
System.out.println("The max num is : " + max);
System.out.println("The min num is : " + min);


	}

}
