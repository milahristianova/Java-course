import java.util.Scanner;
public class Zadacha5 {
	public static void main(String[]args) {
	
		Scanner scanner = new Scanner(System.in);
		int[] array = new int [1000];
		for (int i = 10; i <= 999; i++){
			array[i] = i;
		}
		for (int j = 10; j< 100; j++){
			for(int n = 0; n < 10; n++){
				if(j / 10 == n && j % 10 == n){
					System.out.println(j);
				}
			}
		}
		for(int m = 100; m <= 999; m++){
			if(m / 100 == (( m%100) % 10 )){
				System.out.println(m);
				
				}
				
			}
		}
	}
