package Person;

public class Asisstant extends Lecturer implements chekingHomework {
private boolean headAsisstant;
public Asisstant(){
	super();
	this.headAsisstant = false;
}
public Asisstant(String firstName, String lastName, int age, int yearsOfWork, String nameOfUniverity, boolean headAsisstant){
	super(firstName, lastName, age, yearsOfWork, nameOfUniversity);
	setHeadAsisstant(headAsisstant);
}
public boolean isHeadAsisstant() {
	return headAsisstant;
}
public void setHeadAsisstant(boolean headAsisstant) {
	this.headAsisstant = headAsisstant;
}
public void cheking(){
	System.out.println("Cheking homework: ");
}
public void chekingExams(){
	System.out.println("I can check ");
}
	public void writeAnArticle(){
		System.out.println("I can write an article");
	}
}

