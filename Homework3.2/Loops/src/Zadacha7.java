import java.util.Scanner;
public class Zadacha7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=input.nextInt();
		System.out.println("Enter k: ");
		int k= input.nextInt();
		int n1 =1;
		int k1=1;
		if(k<1 || k>n){
			System.out.println("Your numbers must be 1<n<k!");
		}else{
			for(int i=1; i<=n; i++){
			n1= n1 *i;
		}
		for(int i=1; i<=k; i++){
			k1= k1 *i;
		}
		double result=n1/k1;
		System.out.println("n! / k! = "+result);
		
		
		}
		input.close();
	}

}