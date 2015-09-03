package DesignPattern;

public class Phone extends Device {
 int price;
 
 public Phone(){
	 super();
 }
 public Phone (int price, String model, String mark){
	 super();
		 this.price = price;
		 this.mark = mark;
		 this.model = model;
	 }
	 public void Information(){
		 super.Information();
		 System.out.println(price);
		 
	 }
 }

