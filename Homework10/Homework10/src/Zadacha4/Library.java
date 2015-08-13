package Zadacha4;


import java.util.ArrayList;
import java.util.TreeMap;

public class Library {
	private String name;
	private String adress;
	private TreeMap<String, ArrayList<Book>> collection = new TreeMap<String, ArrayList<Book>>();
	ArrayList<Book> list = new ArrayList<Book>();
public Library(){
	super();
}
public Library(String name, String adress, TreeMap<String,ArrayList<Book>> collection){
	super();
	setName(name);
	setAdress(adress);
	setCollection(collection);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public TreeMap<String, ArrayList<Book>> getCollection() {
	return collection;
}
public void setCollection(TreeMap<String, ArrayList<Book>> collection) {
	this.collection = collection;
}
public String toString(){
	return "Library: " + name + "|Adress: " + adress + "|books: " +collection;
}
public void addBook(String name, String author, int pages) {

	Book book = new Book(name, author, pages);
	list.add(book);
}

public void removeBook(String name) {
	for (Book book : list) {
		if (book.getTitle().equals(name)) {
			list.remove(book);
		}
}
}
}

