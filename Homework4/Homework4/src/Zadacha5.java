import java.util.Scanner;

public class Zadacha5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {3, 19, 15, 0, 25, 101, 300, 12, 1, 8,};
		System.out.print("Array is: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		
		for(int j = 0; j < array.length; j++){
			for(int i = 0; i < (array.length - 1); i++){
				if(array[i] > array[i + 1]){
					int temp;
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;	
				}
			}
		}
		
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int mean = (array.length / 2) + 1;
		int averageNumber = array[mean - 1];
		
		if(num < averageNumber){
			for(int i = 0; i < mean; i++){
				if(num == array[i]){
					System.out.println("Index: ");
					System.out.println(i);
					break;
				} 
			}
		} else if(num > averageNumber){
			for(int i = mean; i < array.length; i++){
				if(num == array[i]){
					System.out.print("Index: ");
					System.out.println(i);
					break;
				}
			}
		} else{
			System.out.println("Index: ");
			System.out.println(mean - 1);
		} 
		
		

	}

}