package com.kodewala.Object01;

public class Book {
private int bookId;
private String title;
private String author;
private boolean Availabilty;

private static String libraryName ="City Central Library";
void addBook(int id,String bookTitle,String bookAuthor) {
	bookId=id;
	title=bookTitle;
	author=bookAuthor;
	Availabilty=true;
}
void issueBook() {
	if(Availabilty) {
		Availabilty=false;
		System.out.println(title + " issued Successfully. ");
	}else {
		System.out.println(title + " is already issued.");
	}
}
void displayBook() {
	System.out.println("Book Id : "+bookId);
	System.out.println("Tittle : "+title);
	System.out.println("Author : "+author);
	System.out.println("Available : "+Availabilty);
}
static void  displayLibName()
{
	System.out.println("Library : "+libraryName);
}
}
