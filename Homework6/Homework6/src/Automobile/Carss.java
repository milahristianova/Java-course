package Automobile;
import java.util.Scanner;

public class Carss {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Car[]array = new Car[10];
	double price;
	boolean name = true;
	int x;
	double fuel;
	
	for(int i=0; i<5; i++){
		System.out.println("Enter fuel:");
		fuel = scanner.nextDouble();
		
		System.out.println("Enter price:");
		price = scanner.nextDouble();
		array[i] = new Automobile(fuel);
		array[i].Car_1(price);
		System.out.println(((Automobile)array[i]).fuel);
	}
	for(int i = 5; i<10; i++){
		System.out.println("Enter passable or not:");
		x = scanner.nextInt();
		if(x == 1)name = true;
		if(x == 0)name = false;
		
		System.out.println("Enter price");
		price = scanner.nextDouble();
		array[i] = new Suv(name);
		array[i].Car_1(price);
	}
	double m = 0;
	for(int n =0; n<10; n++){
	  for(int y = 0; y<10; y++){
		  if (y == 10-1){
			  continue;
		  }
		  if(array[y].price>array[y+1].price){
			  m = array[y+1].price;
			  array[y+1].price = array[y].price;
			  array[y].price = m;
		  }
	  }
	}
	System.out.println("The new array is: ");
	for(int z=0; z<10; z++){
		System.out.println("The firs price is "+ array[z].price);
		
		  }
	  }
	

	}


