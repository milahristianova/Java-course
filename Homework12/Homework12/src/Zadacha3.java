import java.util.Scanner;
public class Zadacha3 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String array = scanner.nextLine();
	String[]array_1 = array.split(" ");
	for(int i=0; i<array_1.length; i++){
		for(int j=0; j<array_1.length-1;j++){
			if(array_1[j].charAt(0)>array_1[j+1].charAt(0)){
				String n;
				n=array_1[j];
				array_1[j] = array_1[j+1];
				array_1[j+1]=n;
				
			}
		}
	}
for(int i=0;i<array_1.length;i++){
	System.out.println(array_1[i]);
}
scanner.close();
}
	}


