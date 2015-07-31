package Stock;

public class Deserts extends Stock {
	String name;
	int quantity;
	
	public Deserts(){
		super();
		this.name = "";
		this.quantity = 0;
	}
	public Deserts(int price, boolean available, String name,int quantity){
		super(price,available);
		this.name = name;
		this.quantity = quantity;
		
	
	
	

	}

}
