import java.util.Scanner;
public class Zadacha2 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int x = scanner.nextInt();
int y = scanner.nextInt();		
		
		if ( (x < 0 ) && (y < 0) || (x > 0 ) && (y > 0) ){
		System.out.println("+");
		}

		if	( (x > 0) && (y < 0) || (x < 0) && (y > 0) ){
	    		    
			System.out.println("-");
		}
		
	}
}
	


