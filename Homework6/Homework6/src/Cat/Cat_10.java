package Cat;


public class Cat_10{

	public static void main(String[] args) {
		
		
		Cat[] a = new Cat[10];
		a[0] = new Cat("Misha", 10);
		a[1] = new Cat("Jivko", 7);
		a[2] = new Cat("Misho", 12);
		a[3] = new Cat("Ivo", 19);
		a[4] = new Cat("Mishoo",7);
		a[5] = new Cat("Pesho",4);
		a[6] = new Cat("Viktor", 15);
		a[7] = new Cat("Chocho", 11);
		a[8] = new Cat("Viki", 9);
		a[9] = new Cat("Gabi", 16);
		for(int i = 0; i < 10; i++){
			a[i].Say();
		}

 }
}

