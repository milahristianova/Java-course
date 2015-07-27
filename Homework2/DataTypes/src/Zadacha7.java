import java.util.Scanner;
public class Zadacha7 {

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		 int chislo = object.nextInt();
		 
		 if(chislo%5 ==0){
				System.out.println("0");
				System.out.println(chislo);
				System.out.println(chislo%5);
			}else{
				System.out.println("1");
				System.out.println(chislo);
				System.out.println(chislo%5);
			}
		
		 if(chislo%7 ==0){
				System.out.println("0");
				System.out.println(chislo);
				System.out.println(chislo%7);
			}else{
				System.out.println("1");
				System.out.println(chislo);
				System.out.println(chislo%7);
			}	
			
			 
		 }
		 
		 
  
    
    
    
	}


