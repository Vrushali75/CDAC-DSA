package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.linkedlist.SinglyLinkedListEmp;

public class EmployeeServiceImpl implements EmployeeService{

		private SinglyLinkedListEmp emp;
		public EmployeeServiceImpl()
		{
			emp=new SinglyLinkedListEmp();
		}

		@Override
		public void addEmployee() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter employee ID: ");
			int eid=sc.nextInt();
			System.out.println("Enter employee Name: ");
			String ename=sc.next();
			System.out.println("Enter employee Salary");
			double salary=sc.nextDouble();
			System.out.println("Enter position for the data to be entered:");
			int pos=sc.nextInt();
			
			emp.addEmployeeByPos(new Employee(eid,ename,salary),pos);
		}

		@Override
		public void displayAll() {
			emp.displayNodes();
			
		}

		@Override
		public void displayByName(String nm) {
			emp.showByName(nm);
			
		}

		@Override
		public void deleteById(int eid) {
			emp.delById(eid);
			
		}

		@Override
		public void displayById(int id) {
			emp.showById(id);
			
		}
}
