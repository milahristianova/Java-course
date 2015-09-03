package DesignPattern;

public class Test {

	public static void main(String[] args) {
		DeviceFactory temp=DeviceFactory.getInstance();
		temp.create("Phone");
		temp.create("Laptop");
		temp.create("Tablet");


	}

}
