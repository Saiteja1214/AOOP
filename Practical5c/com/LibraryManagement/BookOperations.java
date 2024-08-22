package com.LibraryManagement;

import java.util.Optional;

public interface BookOperations {
	void addBook(Book book);
    Optional<Book> findBookById(int bookId);
}
