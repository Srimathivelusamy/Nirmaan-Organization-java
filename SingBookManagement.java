package Day12;

import java.util.Scanner;

public class SingBookManagement {
	
	public static void main(String args[])
	{
	Book book1 = null;
		
	    
	    
	while(true) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your choice");
	    System.out.println( "1 for add book");
	    System.out.println("2 for update book");
	    System.out.println("3 for show book ");
	    
				int a = sc.nextInt();
		switch (a) {
		case 1: {
			
			 book1 = new Book("OOPs", "Srimathi", 200, 7);
			break;
			
		}
		case 2:
		{
			book1.setAuthor("Mathi");
		    book1.setTitle("OOPs");
		    book1.setPrice(700);
		    book1.setNumberOfCopies(4);
		    break;
		}
		case 3:
		{
			System.out.println(book1);
			break;
		}
		default:
			System.out.println("Enter the correct choice");
		}
	}
	}
	

}
