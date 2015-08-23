import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Zadacha2 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String string = scanner.nextLine();
		
		String[] parts = string.split(" ");
		for(String part: parts){
			String string_1 = "ka";
			if(part.length() > string_1.length()){
				queue.offer(part);
			}
		}
		while(!queue.isEmpty()){
			String current = queue.poll();
			System.out.println(current + " ");
			
			}
		}
	}


