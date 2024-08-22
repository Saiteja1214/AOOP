package com.LibraryManagement;

import java.util.Optional;

public class Book {
	  private int bookId;
	    private String title;
	    private boolean isAvailable;

	    public Book(int bookId, String title) {
	        this.bookId = bookId;
	        this.title = title;
	        this.isAvailable = true;
	    }

	    public int getBookId() {
	        return bookId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean isAvailable) {
	        this.isAvailable = isAvailable;
	    }

		public static Optional<Book> stream() {
			// TODO Auto-generated method stub
			return null;
		}

		public static void add(Book book) {
			// TODO Auto-generated method stub
			
		}

		public boolean isAvailable() {
			// TODO Auto-generated method stub
			return false;
		}

		public String getTitle() {
			// TODO Auto-generated method stub
			return null;
		}
}
