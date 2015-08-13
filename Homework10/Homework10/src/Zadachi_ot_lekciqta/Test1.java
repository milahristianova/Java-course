package Zadachi_ot_lekciqta;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> student = new HashMap<>();
		for(int i=1;i<=3;i++){
			System.out.println("Enter first name: ");
			String firstName = scanner.next();
			System.out.println("Enter last name: ");
			String lastName = scanner.next();
			System.out.println("Enter student's number: ");
			String number = scanner.next();
			HashMap<String,ArrayList<Integer>> subjectMarks = new HashMap<String,ArrayList<Integer>>();
			Student newStudent = new Student(firstName, lastName, number, subjectMarks);
			
			for(int j=1;i<=5;j++){
				System.out.println("Enter a subject: ");
				String subject = scanner.next();
				
				ArrayList<Integer>marks = new ArrayList<>();
				System.out.println("Enter a mark: ");
				int x = scanner.nextInt();
				System.out.println("Enter a mark: ");
				int y = scanner.nextInt();
				System.out.println("Enter a mark: ");
				int z = scanner.nextInt();
				marks.add(x);
				marks.add(y);
				marks.add(z);
				subjectMarks.put(subject, marks);
				newStudent.setFirstName(firstName);
				newStudent.setLastName(lastName);
				newStudent.setNumber(number);
				newStudent.setMarks(subjectMarks);
			}
			student.put(firstName, newStudent);
		}
		System.out.println(student);
		System.out.print("Enter name of student: ");
		String studentName = scanner.next();

		System.out.println("Average mark for subject is:");
		String subject = scanner.nextLine();
		if(student.containsKey(studentName)){
			
			System.out.printf("Average mark (%s): %f \n", subject, Student.calculateAvarageMark(subject));
			
		}
	}


			
		}
	

