package Zadacha3;

public class Threads {
synchronized void Numbers(){
	for(int i = 0; i <= 50000; i++){
		System.out.println(i);
		 if( i == 25000){
			 try{
				 wait();
			 }catch (Exception e) {
			 }
		 }
	}
}
synchronized void Text(){
	for(int i = 0; i < 20; i++){
		System.out.println("Running...");
		try{
			Thread.sleep(500);
		}catch (InterruptedException e){
			System.out.println(e);
			e.printStackTrace();
			 }
		 }
	}



	
	public static void main(String[] args) {
	Threads method = new Threads();
		
		new Thread() {
			public void run() {
				method.Numbers();
			}
		}.start();

		new Thread() {
			public void run() {
				method.Text();
			}
		}.start();
	}
	
}
