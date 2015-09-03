package DesignPattern;

public class Laptop extends Device {

	int memory;

	Laptop(){
		super();
	}
	Laptop(int size, String model, String mark){
		this.mark = mark;
		this.model = model;
		this.memory = size;
	}
	public void Information(){
		System.out.println(model);
		System.out.println(mark);
		System.out.println(memory);
		
	
}
}
