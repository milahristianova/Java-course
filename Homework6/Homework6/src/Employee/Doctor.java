package Employee;

public class Doctor extends Employee {
	
	
	
	int nights;
	int days;
	
	public Doctor(){
		nights = 0;
		days = 0;
	}
	public Doctor(int nights, int days){
		this.nights = nights;
		this.days = days;
	}

public Doctor(int hours, double salary, int days, int nigths){
	super(hours, salary);
	setDays(days);
	setNigths(nigths);
}
public int getDays(){
	return days;
}
public void setDays(int days){
	this.days = days;
}
public int getNigths(){
	return nights;
}
public void setNigths(int nights){
	this.nights = nights;
}
public void workDoctor(){
	System.out.println("I'm working " + this.days);
	System.out.println("I'm working " + this.nights);
	System.out.println();
	
	

	}

}
