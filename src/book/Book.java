package book;
/*
	Program to assign title, author and amount of volumes to a Book, 
	Author: Amirkhan Mukashev. Sudent, ID: 6605412.
	E-mail Address: am25524@email.vccs.edu.
	Programming Assignment of Unit3.
	Date Modified: 15/03/2015.
	Class Book
*/
public class Book 
{
	
/******** Class Variables -- state of the object ***/
	private String title;
	private String author;
	private Short numberOfPages;

	
	
/******** Class Methods -- Constructors -- set the state ***/	

	public Book(String title, String author, short numberOfPages) 
	{
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		
	}

	@Override
	public String toString()
	{
		return "Title:" + this.title + "\n Author:" + this.author + "\nPages:" + this.numberOfPages;
	}

}
