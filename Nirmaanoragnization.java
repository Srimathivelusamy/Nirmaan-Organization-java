package day6;
import java.util.Scanner;

public class Nirmaanoragnization {
	
	String studentname="";
	int id=0;
	int age=20;
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		
		 Nirmaanoragnization ngo= new  Nirmaanoragnization();
		 
		 ngo.studentname="Divya";
		 ngo.id=9612;
		 ngo.age=22;
		 
		 System.out.println("Enter your name");
		 ngo.studentname=sc.next();
		 System.out.println("Enter your id");
		 ngo.id=sc.nextInt();
		 System.out.println("Enter your age");
		 ngo.age=sc.nextInt();
		 
		
		 
		
	}
}
