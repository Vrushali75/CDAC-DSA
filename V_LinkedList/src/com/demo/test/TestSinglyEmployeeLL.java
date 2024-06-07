package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestSinglyEmployeeLL {

	public static void main(String[] args) {
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1) Add new Employee by position \n2) Display All \n3) Display by ID");
			System.out.println("4) Display by Name \n5)Delete by ID \n6) EXIT");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					eservice.addEmployee();
					break;
		
				case 2:
					eservice.displayAll();
					break;
		
				case 3:
					System.out.println("Enter ID to be displayed: ");
					int id=sc.nextInt();
					eservice.displayById(id);
					break;
		
				case 4:
					System.out.println("ENter name to be displayed: ");
					String nm=sc.next();
					eservice.displayByName(nm);
					break;
		
				case 5:
					System.out.println("Enter ID to be deleted: ");
					int eid=sc.nextInt();
					eservice.deleteById(eid);
					break;
		
				case 6:
					System.out.println("Thank You!");
					break;
				
				default:
					System.out.println("Invalid choice ");
					break;
			}

		}while(choice!=6);
	}
		
}
