import java.util.ArrayList;
import java.util.Scanner;

public class Zadcha1 {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<20;i++){
			String scan;
			System.out.println("Please enter a word: ");
			scan = scanner.nextLine();
			words.add(scan);
		}
		for(int i=0;i<words.size();i++){
			String compare = words.get(i);
			String compare_1;
			int counter = 0;
			for(int j=0;j<words.size();j++){
				compare_1=words.get(j);
				if(compare.equals(compare_1)){
					if(j!=i) words.remove(j);
					counter++;
				}
			}
		
		
				System.out.println("The list contains : "+ compare+" "+counter+" time/s");
				
				}
			}
}


	


