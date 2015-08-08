import java.util.Scanner;
public class Zadacha1_otlekciq {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a sentence : ");
		String sentence = scanner.nextLine();
		boolean startsWith = sentence.startsWith("Greeting");
		System.out.format("The sentence begins with the word\"Greeting\" : %s ",startsWith);
	System.out.println();
	boolean endsWith = sentence.endsWith(".");
	System.out.format("The sentence ends with the world \".\" %s ",endsWith);
	System.out.println();
	boolean contains = sentence.contains("water");
	System.out.format("The sentence contains the word \"water\": %s \n", contains);
	}

}
