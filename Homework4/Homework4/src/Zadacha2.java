

import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		int x = scanner.nextInt();
		long[] array = new long[x];	
		
		for(int i = 0; i < array.length; i++){
			if(i == 0){
				array[i] = 0;
			} else if(i == 1){
				array[i] = 1;
			} else {
				array[i] = array[i-1] + array[i-2];
			}
				
		}
		
		System.out.print("Fibonacci numbers = {");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.print("}");
		
		
		
		
		
	}

}