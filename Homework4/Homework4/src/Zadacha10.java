import java.util.Scanner;
public class Zadacha10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("A: ");
		int A = scanner.nextInt();
		
		System.out.println("B (B > A) : ");
		int B = scanner.nextInt();
		
		System.out.println("{");
		 for(int i = A; i<= B; i++){
			 if(i % 3 == 0){
				 System.out.print(i + " ");
				 
			 }
		 }
System.out.println("}");

	}

}
