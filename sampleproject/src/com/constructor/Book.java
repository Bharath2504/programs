package com.constructor;

public class Book {
	
	    private String title;
	    private String author;
	    private int year;

	    
	    public Book(String title, String author, int year) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	    }

	    // Getter methods
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public int getYear() {
	        return year;
	    }

	    // Setter methods
	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public static void main(String[] args) {
	       
	        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
	        
	        System.out.println("Title: " + book.getTitle());
	        System.out.println("Author: " + book.getAuthor());
	        System.out.println("Year: " + book.getYear());

	       
	    }
	}

