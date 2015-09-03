package DesignPattern;
public class DeviceFactory{
private static DeviceFactory instance = new DeviceFactory();

public DeviceFactory(){
	 
 
}
 
 public static DeviceFactory getInstance(){
	 return instance;

	
	 }
	 public void create(String type){
		 if(type.equals("Tablet")){
			 Tablet tablet=new Tablet(7, "Asus", "Hr800" );
			 tablet.Information();
		 }
		 if(type.equals("Phone")){
			 Phone phone=new Phone(100, "Samsung" , "Neo" );
			 phone.Information();
		 }
		 if(type.equals("Laptop")){
			 Laptop laptop=new Laptop(8, "Acer" , "GH14" );
			 laptop.Information();
		 }
	 }
 }
