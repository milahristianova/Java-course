package Zadacha4;

public class Book {
 protected String title;
 protected String autor;
 protected int pages;
public Book() {
	super();
}
public Book(String title, String autor, int pages){
	super();
	setTitle(title);
	setAutor(autor);
	setPages(pages);
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public String toString(){
	return "Title: " + this.title + "|Autor: " + this.autor + "|Pages:" + this.pages;
	
	}
}
