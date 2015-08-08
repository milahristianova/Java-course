import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word : ");
String word = scanner.nextLine();
String word_1 = word.toUpperCase();
System.out.println("Enter a text : ");
String text = scanner.nextLine();

String result = text.replaceAll(word, word_1);
System.out.println(result);

	}

}
