package Person;

public class Teacher extends Person implements chekingHomework  {
 private String subject;
  public Teacher(){
	  super();
	  this.subject = "";
  }
  public Teacher(String firstName, String lastName, int age, int yearsOfWork, String subject){
	  super(firstName, lastName, age, yearsOfWork);
	  setSubject(subject);
  }
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public void chekingHomework(){
	System.out.println("Cheking homework");
}
public void goodDay(){
	System.out.println("Good afternoon!");
}

public void goodBye(){
	System.out.println("Goodbye!");
}

	
}

  

