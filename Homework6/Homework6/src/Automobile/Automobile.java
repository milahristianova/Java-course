package Automobile;

public class Automobile extends Car  {
 
	public double fuel;
	public Automobile(){
		this.fuel = 0;
	}
	public Automobile(double fuel){
		this.fuel = fuel;
	}
	void Print(){
		System.out.println("Price is: " + this.price);
		System.out.println("Fuel is: " + this.fuel);
		
	
	

	}

}
