	import java.util.Scanner;
	public class Zadacha4 {
		
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a text: ");
			String text = scanner.nextLine();
			System.out.println("Enter a word for searching: ");
			String word = scanner.nextLine();
			
			String newText = text.toLowerCase();
			String[] sentences = newText.split("[.!?]+");
			
			for (int i = 0; i < sentences.length; i++) {
				int index = sentences[i].indexOf(word);
				if(index != -1){
					System.out.print(sentences[i] + ".");
				}
			}

		}

	}
