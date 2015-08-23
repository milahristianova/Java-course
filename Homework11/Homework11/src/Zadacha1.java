import java.util.Scanner;
import java.util.Stack;

public class Zadacha1 {

	public static void main(String[] args) {
	Stack<String> myStack = new Stack<String>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String string = scanner.nextLine();
	
	String[] parts = string.split(" ");
	for(String part: parts){
		myStack.push(part);
	}while(!myStack.isEmpty()){
		String current = myStack.pop();
		
		System.out.println(current + " ");
		
	}

	}
	

}
