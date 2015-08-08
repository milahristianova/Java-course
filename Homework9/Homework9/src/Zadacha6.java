import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Zadacha6 {

	public static void main(String[] args) {
		try{
			FileReader fileReader = new FileReader("text.txt");
			BufferedReader bufferedreader = new BufferedReader(fileReader);
			FileWriter fileStream = new FileWriter("text1.txt");
			BufferedWriter writer = new BufferedWriter(fileStream);
			

			while (bufferedreader.ready()) {
				
				String line = bufferedreader.readLine();
				String text = line.replaceAll("\\."," ");
				text = text.replaceAll("\\,", " ");
				text = text.replaceAll("\\!", " ");
				text = text.replaceAll("\\?", " ");
				text = text.replaceAll("\\;", " ");
				writer.write(text);
				writer.newLine();
			}
		writer.close();
	
		}
		
		
			catch(Exception e){
				System.out.println("Mistake while reading a file.");
				
				System.out.println(e.getMessage());
				System.exit(0);
			}
	}
}

			
		
	


