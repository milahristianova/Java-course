package Employee;

public class Test {

	public static void main(String[] args) {
		Doctor d = new Doctor(63, 2600, 11, 15);
		d.information();
        d.workDoctor();
		
		Policeman p = new Policeman(78, 2000, "Lieutenant");
		
	p.information();
		p.sayRang();
		
	}
	

}
