package com.kodewala.Object01;

public class LibraryApp {
	public static void main(String[] args) {
		 Book book1 = new Book();

	        book1.addBook(
	            101,
	            "Java Programming",
	            "James"
	        );

	        Book book2 = new Book();

	        book2.addBook(
	            102,
	            "Spring Boot",
	            "Craig"
	        );
Book.displayLibName();
System.out.println();
book1.issueBook();

System.out.println();

book1.displayBook();

System.out.println();

book2.displayBook();


	}

}
