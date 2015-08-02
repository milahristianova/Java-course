package Person;

public class CollegeTeacher extends Teacher implements chekingHomework {
String college;
public CollegeTeacher(){
	super();
	this.college = "";
}
public CollegeTeacher(String firstName, String lastName, int age, int yearsOfWork, String subject, String college){
	super(firstName, lastName, age, yearsOfWork, subject);
	setCollege(college);
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public void writeAnArticle(){
	System.out.println("I can write an article!");
	
}
public void chekingHomework() {
	System.out.println("Chek homework");
}
}

