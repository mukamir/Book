package book;
/*
	Program to assign title, author and amount of volumes to a Book, 
	Author: Amirkhan Mukashev. Sudent, ID: 6605412.
	E-mail Address: am25524@email.vccs.edu.
	Programming Assignment of Unit3.
	Date Modified: 15/03/2015.
	Current Document code include Main Method (LockerDemo)
*/

import java.util.Scanner;
public class DemoVolume 
{
	public static void main (String []args)
	{
		/*** Class Variables ***/
		String volumeName1;
		short numberOfBooks1;
			
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the name of the Volume: ");
		volumeName1 = keyboard.nextLine();
		
		System.out.println("Enter Number of Books:");
		numberOfBooks1 = Short.parseShort( keyboard.nextLine() );
		
		Book[] defaultBookName = new Book[numberOfBooks1];
		System.out.println("Please enter the title, author, and number of pages  book:");
        
		for (int i = 0; i < numberOfBooks1; i++)
		{
            System.out.print("Title:" );
            String title = keyboard.nextLine();
        
            System.out.print("Author:");
            String author = keyboard.nextLine();
            
            System.out.print("Number of Pages:");
            short numberOfPages = Short.parseShort( keyboard.nextLine() );

            defaultBookName[i] = new Book(title ,author ,(short)numberOfPages);

        }
        Volume randomVolume = new Volume(volumeName1,(short) numberOfBooks1, defaultBookName);
        System.out.println(randomVolume);
		
	}
}
