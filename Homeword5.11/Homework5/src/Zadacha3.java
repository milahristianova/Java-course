import java.util.Random;
public class Zadacha3 {
	
	public static void main(String[]args){
		Random random = new Random();
		int a = random.nextInt(10);
		int b = random.nextInt(10);
		int c = random.nextInt(10);
		int count=0;
		Function(a,b,c,count);
	}
	public static void Function(int a, int b, int c, int count){
		if (count == 20){
			return;
		}
		System.out.println("The answer "+(count+1)+" is "+(a*b*c));
		Random random=new Random();
		a = random.nextInt(10);
	     b = random.nextInt(10);
	     c = random.nextInt(10);
	     count++;
	     Function(a,b,c,count);
		
		}
		
	}
