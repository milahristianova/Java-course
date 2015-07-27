import java.util.Scanner;
public class Zadacha9 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[]array = { 1 , 2 , 3, 4, 5, 6 };
int length = array.length;
System.out.println("Array:");
 for (int num : array){
	 System.out.println(num + " ");
 }
 int[] newArray = new int[length];
 for(int i = 0; i< length; i++){
	 newArray[i] = array[length - i - 1];
 }
 System.out.println("New array:");
 for(int num : newArray){
	 System.out.println(num + " ");
 }

	}

}
