
import java.util.ArrayList;
import java.util.Scanner;


public class Zadacha2 {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter text: ");
        String word= scanner.nextLine();
        word = word.toLowerCase();
         String[] decision=(word.split(" "));
         for(int n=0;n<decision.length;n++){
        	 words.add(decision[n]);
         }
        for(int i=0;i<words.size();i++){
       	 String compare=words.get(i);
       	 String compare_1;
       	 int counter=0;
       	 for(int j=0;j<words.size();j++){
       		 compare_1=words.get(j);
       		 if(compare.equals(compare_1)){
       			 if(j!=i) words.remove(j);
       			 counter++;
       		 }
       	 }
       	 if(counter==1)
       		 System.out.println(compare);
        }
        

	}

}