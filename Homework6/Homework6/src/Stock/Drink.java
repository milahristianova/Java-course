package Stock;

public class Drink extends Stock {
String name;
int quantity;

public Drink(){
	super();
	this.name = "";
	this.quantity = 0 ;
}
public Drink(int price, boolean available, String name, int quantity){
	super(price, available);
	this.name = name;
	this.quantity = quantity;

	}

}
