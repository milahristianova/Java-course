package Employee;

public class Employee {

	
		int hours;
		double salary;
		
		public Employee(){
			hours = 0;
			salary = 0;
		}
		public Employee(int hours, double salary2){
			this.hours = hours;
			this.salary = salary2;
		
			setHours(hours);
			setSalary(salary2);
		}
		public int getHours(){
			return hours;
		}
		public void setHours(int hours){
			this.hours = hours;
		}
		public double getSalary(){
		return salary;
}
public void setSalary(double salary){
	this.salary = salary;
}
public void information(){
	System.out.println("I'm working " + this.hours);
	System.out.println("My salary is " + this.salary);
	
					
		}
		
	}

