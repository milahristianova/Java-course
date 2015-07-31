package Stock;

public class Fruit extends Stock{
	String bioproducts;
	int number;
	
	public Fruit(){
		super();
		this.bioproducts = "";
		this.number = 0;
	}
	
	public Fruit(int price, boolean available, String bio, int number){
		super(price, available);
		this.bioproducts = bio;
		this.number = number;
		
	}

}
