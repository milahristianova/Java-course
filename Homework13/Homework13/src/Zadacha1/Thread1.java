package Zadacha1;


public class Thread1 extends Thread{
public void run(){
	System.out.println("The thread is started!");
	this.setName("Thread one ");
	System.out.println("I am " + this.getName());
	try{
		Thread.sleep(1000);
	}catch(InterruptedException e){
		System.out.println(e);
		e.printStackTrace();
	}
	System.out.println(this.getName() +  "completed!");
	
	}
}
	

