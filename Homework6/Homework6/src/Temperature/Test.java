package Temperature;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Temperature convert = new Temperature();
		System.out.println("Enter the temperature:");
		double x = scanner.nextDouble();
		double y;
		y = convert. Convert(x);
		
		System.out.println("Farenheit = " + y);
		
		}

	}


