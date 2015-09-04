package Zadacha1;

public class Thread5 extends Thread{
	public void run(){
		System.out.println("The thread is started!");
		this.setName("Thread five ");
		System.out.println("I am " + this.getName());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(this.getName() + "completed!");
		
	}

public static void main(String[] args) {
	Thread t1 = new Thread1();
	Thread t2 = new Thread2();
	Thread t3 = new Thread3();
	Thread t4 = new Thread4();
	Thread t5 = new Thread5();
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
}
}