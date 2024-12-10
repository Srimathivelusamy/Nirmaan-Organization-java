package Day13;

import java.util.Scanner;

public class Employeemanagement {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println( "Enter your choice");
			System.out.println("1 for add ");
			System.out.println("2 for update");
			System.out.println("3 for show ");
			System.out.println("0 for Exit");
			
			int a = sc.nextInt();
			switch(a)
			{
			
			
			case 1: {
				employee1 = new Employee("Srimathi","Testing",203792808,1312);
				break;
			}
			case 2:{
				employee1.setName("Mathi");
				employee1.setDepartment("Developer");
				employee1.setMobileNumber(2034984548);
				employee1.setIdNumber(1213);
				break;
			}
			case 3:
			{
				System.out.println(employee1);
				break;
			}
			case 4:{
				System.out.println("Exit");
			}
				default: 
					System.out.println("Enter the correct choice");
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}



















}

















