import java.util.Scanner;
public class Zadacha8 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println(" Enter length");
	
	int length = scanner.nextInt();
	int array[] = new int [length];
	boolean sum = true;
	
	System.out.println("Enter Array");
	
	for(int i = 0; i< length; i++){
		array[i] = scanner.nextInt();
	}
	for (int i = 0; i < (length + 1) /2 ; i++){
		if (array[i] == array[length - i -1]){
		}else{
			sum = false;
		}
		if (sum == true){
			System.out.println("Symetric");
		}else{
			System.out.println("Not symetric");
			
		}
	
	}

	}

}
