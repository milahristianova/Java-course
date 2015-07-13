import java.util.Scanner;
public class Zadacha8 {

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		int chislo = object.nextInt();
		if(chislo%2 ==0){
			System.out.println("Chetno");
			System.out.println(chislo);
			System.out.println(chislo%2);
		}else{
			System.out.println("Nechetno");
			System.out.println(chislo);
			System.out.println(chislo%2);
		}
			
	}

}
