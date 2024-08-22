package com.LibraryManagement;

public class SimpleBorrowingManager implements BorrowingManager{
	 public void borrowBook(Member member, Book book) {
	        if (book.isAvailable()) {
	            book.setAvailable(false);
	            member.borrowBook(book);
	            System.out.println(member.getName() + " borrowed " + book.getTitle());
	        } else {
	            System.out.println("Book " + book.getTitle() + " is currently unavailable.");
	        }
	    }

	    @Override
	    public void returnBook(Member member, Book book) {
	        book.setAvailable(true);
	        member.returnBook(book);
	        System.out.println(member.getName() + " returned " + book.getTitle());
	    }
}
