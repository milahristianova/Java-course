import java.util.Scanner;
 
 
public class Zadacha9 {
 
        public static void main(String[] args) {
                Scanner number = new Scanner(System.in);
                String line = null;
                int max = 0, temp = 0;
               
                System.out.print("Enter the numbers: ");
                line = number.nextLine();
              
                number = new Scanner(line);
                
               
               
                while (number.hasNextInt()) {
                        temp = number.nextInt();
                         if (temp > max) {
                                max = temp;
                        }
                }
               
                System.out.println("Max: " + max);
                
        }
 
}
        
        
	


