package Zadacha1;

public class Thread4 extends Thread {
	public void run(){
		System.out.println("The thread is started!");
		this.setName("Thread four ");
		System.out.println("I am " + this.getName());
		try{
			Thread.sleep(4000);
		}catch(InterruptedException e){
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println( this.getName() + "completed!");
		
		}
	}


