package Person;

public class Lecturer extends Person implements chekingHomework  {
protected static String nameOfUniversity;
private static final int lectures = 10;


public Lecturer(){
super();
this.nameOfUniversity = "";
}
public Lecturer (String firstName, String lastName, int age, int yearsOfWork, String nameOfUniversity ){
	super(firstName, lastName, age, yearsOfWork);
	setNameOfUnivesity(nameOfUniversity);
}
public String getNameOfUnivesity() {
	return nameOfUniversity;
}
public void setNameOfUnivesity(String nameOfUnivesity) {
	this.nameOfUniversity = nameOfUnivesity;
}
public void chekingHomework(){
	System.out.println("Cheking Homework!");
}
public void goodDay(){
	System.out.println ("Good afternoon!");
}
public void printLectures(){
	System.out.println("Max lectures " + lectures);
}
	public void exercises(){
		System.out.println("I've got exercises!");
	}
	public void exercises(int hours, String subject){
		System.out.println("I've got exercises on " + subject + hours);
	}
}

