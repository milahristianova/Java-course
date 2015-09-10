import java.util.Arrays;
import java.util.Scanner;

public class Matrixx {

	private static void transpose(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = x;
            }
        }
    }


    public static void rotateByNinetyToLeft(int[][] m) {
       
        transpose(m);

  
        for (int  i = 0; i < m.length/2; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[m.length -1 -i][j]; 
                m[m.length -1 -i][j] = x;
            }
        }
    }


    public static void rotateByNinetyToRight(int[][] m) {
      
        transpose(m);

      
        for (int  j = 0; j < m[0].length/2; j++) {
            for (int i = 0; i < m.length; i++) {
                int x = m[i][j];
                m[i][j] = m[i][m[0].length -1 -j]; 
                m[i][m[0].length -1 -j] = x;
            }
        }
    }


    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Please enter a number from 2 to 9: ");

    	 int m, n, c, d = 0;
    	m = scanner.nextInt();     
    	n  = scanner.nextInt();

         int first[][] = new int[m][n];
        
         int sum[][] = new int[m][n];
         System.out.println("Enter the elements of first matrix");
         for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
           first[c][d] = scanner.nextInt();


        rotateByNinetyToRight(first);

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                System.out.print(first[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
        

        rotateByNinetyToLeft(first);

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                System.out.print(first[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");


    }


    public static void outputArray(int[][] array) {
       Scanner scanner = new Scanner(System.in);
    	int sum= 0;
        int[] rowSize =new int[array[0].length];
        int[] colSum =new int[array[0].length];
			for (int i = 0; i < array.length; i++){   
			    for (int j = 0; j < array[i].length; j++){                
			        sum += array[i][j];
			        colSum[j] += array[i][j];
			    }
			    System.out.println("Print the sum of rows =" + sum);
			}  
			for(int k=0;k<colSum.length;k++){
			    System.out.println("Print the sum of columns =" + colSum[k]);

			}
			
			}
    }
    

  








   
 

	
    




    
    
    

        
    
    
		
  
    


	
	

    





