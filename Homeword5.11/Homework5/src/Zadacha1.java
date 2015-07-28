import java.util.Scanner;
public class Zadacha1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int a = scanner.nextInt();
	
	System.out.println("Enter second number: ");
    int b = scanner.nextInt();
	
	System.out.println("Enter third number: ");
	int c = scanner.nextInt();
	
	a = maxNumber(a,b);
	a = maxNumber(a,c);
	
	System.out.println("Max number is :" + a);
	}

public static int maxNumber(int a, int b) {
if(a>b){
	return a;
	
}
if (a<b){
		
	}
return b;
}
}
