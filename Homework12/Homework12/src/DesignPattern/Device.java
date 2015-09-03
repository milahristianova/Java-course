package DesignPattern;

public abstract class Device {

	protected String model;
	protected String mark;
	
	public Device(){
		super();
	}
	public void Information(){
		System.out.println(model);
		System.out.println(mark);
		
	}
}
