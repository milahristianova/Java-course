import java.util.Scanner;

public class Zadacha11{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of  matrix: ");
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		int m = 1;
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = m;
				m++;
			}
		}
		
		
		for(int i = 0; i < n; i++){
			int z = i + 1;
			for(int j = 0; j < n; j++){
				matrix[i][j] = z;
				z += n;
			}
		}
		
		System.out.println("Vertical: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Horizontal: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		

	}

}
