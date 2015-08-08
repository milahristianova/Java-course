import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a word for searching : ");
	String word = scanner.nextLine();
	System.out.println("Enter a text: ");
	String text = scanner.nextLine();
	int counter = 0;
	int c = 0;
	int javaIndex = 0;
	for(;;c=1){
		 javaIndex = text.indexOf(word,javaIndex+c);
		 
		 if(javaIndex==-1){
			 break;
		 }
		 
		 counter ++;
		 
	}
System.out.println(counter);
	}
	
	


}
