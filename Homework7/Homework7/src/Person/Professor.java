package Person;

public class Professor extends Lecturer implements chekingHomework {
private String Title;
public Professor(){
super();
this.Title = "";
}
public Professor (String firstName, String lastName, int age, int yearsOfWork, String nameOfUniversity, String Title){
	super(firstName, lastName,age, yearsOfWork, nameOfUniversity);
	this.Title = Title;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public void printnew(){
	System.out.printf("My name is : "+ getFirstName() + getLastName(), "I am a: " + getTitle(),  "I have " + getYearsOfWork() + " practice" );
}
public void chekingHomework(){
	System.out.println("Checking homework");
}
	public void exams(){
		System.out.println("I can do exams");
	
	
			}

}


