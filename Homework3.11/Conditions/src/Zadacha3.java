import java.util.Scanner;
public class Zadacha3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		 int x = scanner.nextInt();
		 int y = scanner.nextInt();
		 int z = scanner.nextInt();
		 
		 if ( (x < y) && (y < z)){
		  System.out.println("Z is the biggest number");
		 }
		  if ((y < x ) && (z < x)){
		  System.out.println("X is the biggest number");
		  }
		  if ((x < y ) && (z < y)){
		 System.out.println("Y is the biggest number");
		  }
		  }
		 
		 
			
		 
	}


