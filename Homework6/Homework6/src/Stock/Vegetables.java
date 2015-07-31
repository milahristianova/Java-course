package Stock;

public class Vegetables extends Stock {
String name;
String bioproducts;

public Vegetables (){
	super();
	this.name = "";
	this.bioproducts = "";
}
public Vegetables(int price, boolean available, String name, String bioproducts){
	super(price, available);
	this.name = name;
	this.bioproducts = bioproducts;
	
}
}
