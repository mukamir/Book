package book;
/*
	Program to assign title, author and amount of volumes to a Book, 
	Author: Amirkhan Mukashev. Sudent, ID: 6605412.
	E-mail Address: am25524@email.vccs.edu.
	Programming Assignment of Unit3.
	Date Modified: 15/03/2015.
	Class Volume
*/
public class Volume 
{
///******* Class Constants ***/
//	
	//	
	
/******* Class Variables -- state of the object ***/
	private String  volumeName;
	private short   numberOfBooks;
	private Book[]  bookArray;
	
	
	
/******* Class Methods -- Constructors -- set the state ***/
	
	public Volume (String volumeName, short numberOfBooks, Book[] bookArray)
	{
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.bookArray = bookArray;
	}
	
		
/******* Class methods - Accessors -- getters -- return the state ***/		
	
			
	public String getBookArray()
	{
		/*** Local Variable***/
		
		String defaultBookName = " ";
		
		for ( int i = 0; i < bookArray.length; i++ )
		{
			

			defaultBookName += bookArray[i].toString();
		}
		
		return defaultBookName;
	}
	
	
	@Override
	public String toString()
	{
		return "Volume Name: " + volumeName + "\nNumber Of Books: " + numberOfBooks + "\nArray of the Book: " + getBookArray();
	}

}
