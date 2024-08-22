package com.LibraryManagement;

public class LibraryManagement {
	 public static void main(String[] args) {
	        // Create library manager
	        LibraryManager libraryManager = new LibraryManager();

	        // Add books
	        Book book1 = new Book(1, "The Great Gatsby");
	        Book book2 = new Book(2, "1984");
	        libraryManager.addBook(book1);
	        libraryManager.addBook(book2);

	        // Add members
	        Member member1 = new RegularMember(1, "Alice");
	        Member member2 = new PremiumMember(2, "Bob");
	        libraryManager.addMember(member1);
	        libraryManager.addMember(member2);

	        // Borrowing manager
	        BorrowingManager borrowingManager = new SimpleBorrowingManager();

	        // Borrow books
	        borrowingManager.borrowBook(member1, book1);
	        borrowingManager.borrowBook(member2, book2);

	        // Return books
	        borrowingManager.returnBook(member1, book1);
	        borrowingManager.returnBook(member2, book2);
	    }
}
