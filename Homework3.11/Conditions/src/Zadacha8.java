import java.util.Scanner;
public class Zadacha8 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int c = scanner.nextInt();
		 
		 int x1;
		 int x2;
		 
		 
		 int D = (int) Math.pow(b, 2) - 4 * a * c;
		 System.out.println(" D = " + D );
		 
		 if (D < 0){
			 System.out.println("Nqma realni koreni");
		 }
		 if (D == 0){
			 x1 = x2 = ( - b ) / ( 2 * a);
			 System.out.println("x1 = x2 " + x1 );
		 }
			 if (D > 0){
			x1 = (( - b ) + (int) Math.sqrt(D)) / ( 2 * a);
			x2 = (( - b ) + (int) Math.sqrt(D)) / ( 2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			
			}
		 }
		 

	}


