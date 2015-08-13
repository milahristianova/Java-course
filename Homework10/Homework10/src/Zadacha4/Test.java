package Zadacha4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		TreeMap<String, ArrayList<Book>> treeMap = new TreeMap<String, ArrayList<Book>>();
		System.out.println("Name of library: ");
		String name = scanner.nextLine();
		System.out.println("Adress of library: ");
		String adress = scanner.nextLine();
		Library library = new Library(name, adress, treeMap);
		System.out.println(library);

		
		for (int i = 0; i < 2; i++) {
			System.out.println("Title of the book:");
			String title = scanner.nextLine();
			System.out.println("Autor:");
			String autor = scanner.nextLine();
			System.out.println("Number of pages:");
			int pages = scanner.nextInt();
			library.addBook(title, autor, pages);
		}
		System.out.println(library);


		System.out.println("Please enter the book you want to remove:");
		String name_1 = scanner.next();
		library.removeBook(name_1);
		

	}

}