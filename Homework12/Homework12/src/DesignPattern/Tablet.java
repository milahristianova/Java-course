package DesignPattern;

public class Tablet extends Device  {
int size; 
public Tablet(int size, String mark, String model){
	super();
	this.size = size;
	this.mark = mark;
	this.model = model;;
}
public Tablet(){
	super();
}
public void Information(){
	super.Information();
	System.out.println(size);
	
}
}
