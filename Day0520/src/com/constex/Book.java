package com.constex;

public class Book {
	String title;
	String author;

	public Book() {

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String t) {

		title = t;
		author = "작자미상";

	}

	public Book(String t, String a) {

		title = t;
		author = a;

	}

}
