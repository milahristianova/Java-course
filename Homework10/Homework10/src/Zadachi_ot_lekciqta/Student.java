package Zadachi_ot_lekciqta;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
String firstName;
String lastName;
String number;
HashMap<String,ArrayList<Integer>> marks = new HashMap<String, ArrayList<Integer>>();

public Student(){
	super();
}


public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public HashMap<String, ArrayList<Integer>> getMarks() {
	return marks;
}
public void setMarks(HashMap<String, ArrayList<Integer>> marks) {
	this.marks = marks;
}

public Student(String firstName, String lastName, String number, HashMap<String,ArrayList<Integer>>marks){
	super();
	setFirstName(firstName);
	setLastName(lastName);
	setNumber(number);
	setMarks(marks);
}
public static void addSubjectMark(String subject, int mark){
	Student student = new Student();
	if(student.marks.containsKey(subject)){
		student.marks.get(subject).add(mark);
	}
}
public static float calculateAvarageMark(String subject){
	Student student = new Student();
	ArrayList<Integer>marksSubject = student.marks.get(subject);
	float sum = 0;
	for(int i=0;i<=marksSubject.size()-1;i++){
		sum += marksSubject.get(i);
	}
	float avarage = sum/(marksSubject.size());
	return avarage;
}
public String toString(){
	return this.firstName + " " + this.lastName + "number: " + this.number + "marks:" + this.marks;
	
	}
	
	

	}


