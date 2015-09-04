package Zadacha2;

public class Thread1 extends Thread{
int name;
int time;
public Thread1(int name, int time){
	this.name = name;
	this.time = time;
}
public void run (){
	System.out.println(Thread.currentThread().getName() + " is started!");
	Thread.currentThread().setName("Thread " +  name);
	processMessage(time);				
	System.out.println(Thread.currentThread().getName() + " complete!");
}

private void processMessage(int time) {
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		e.printStackTrace();
}
}
}
