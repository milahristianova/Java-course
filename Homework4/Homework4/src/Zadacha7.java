import java.util.Scanner;
    public class Zadacha7{
    	public static void main(String[] args){
    		Scanner scanner = new Scanner(System.in);
    		System.out.println(" Enter length");
    		int length = scanner.nextInt();
    		int[] array = new int[length];
    		System.out.println("Enter array ");
    		
    		
    		
    		for(int i = 0; i< length; i++){
			array[i] = scanner.nextInt();
    		}
    		System.out.println("Search number");
    		
    		int num = scanner.nextInt();
    		for(int i = 0; i < length; i ++){
    			if(array[i] == num ){
    				System.out.println("NUM" + i);
    			}
    			if(i == (length - 1) && i != num){
    				System.out.println("No number");
    			}
    		}
    	
    	}
    }