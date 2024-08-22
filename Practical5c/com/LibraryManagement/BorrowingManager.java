package com.LibraryManagement;

public interface BorrowingManager {
	void borrowBook(Member member, Book book);
    void returnBook(Member member, Book book);
}
