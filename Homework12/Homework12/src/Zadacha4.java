import java.util.Arrays;
import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int [] arr = new int[10];
		
		for (int i = 0; i<arr.length; i++){
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("Before: " + Arrays.toString(arr));
		int[] arrEven= new int[10];
		int [] arrOdd= new int[10];
		for (int i = 0; i<arr.length; i++){
			if(arr[i] % 2 == 0 ){
				arrEven[i]=arr[i];
			}else{
				arrOdd[i]= arr[i];
			
			}
		}
		
	
			
	BubbleSortOdd(arrOdd);
	BubbleSortEven(arrEven);
	             
				System.out.println("Sorted odd numbers: ");
				for(int k:arrOdd){
					System.out.print(k+" ");
				}
				
				System.out.println();
				
				System.out.println("Sorted even numbers: ");
				for(int k:arrEven){
					System.out.print(k+" ");
				}
	    }
				
			
			
			public static void BubbleSortEven(int[]arr){
				for(int i=0;i<arr.length;i++){
					for(int j=i+1;j<arr.length;j++){
						if(arr[i]>arr[j]){
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
					}
			
				}
			public static void BubbleSortOdd(int[]arr){
				for(int i=0;i<arr.length;i++){
					for(int j=i+1;j<arr.length;j++){
						if(arr[i]>arr[j]){
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
	    }
		
	}

				}
}
	    }