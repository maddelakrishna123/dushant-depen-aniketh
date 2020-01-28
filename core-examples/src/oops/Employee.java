package oops;

public class Employee {
	
	
	// properties  / data / instance variables  
	
	 int id;
	String name;
	double salary;
	
	
	/*   Constructor is a special method which is used to intialize instance variables
	 * 
	 */
	
	   // Employee(); 
	public Employee()
	{
		id = 101;
		name ="krishna";
		salary = 12000;
	}
	
	
	// operations  / behaviours / Methods 
	           //getEmployeeData();
	public void getEmployeeData()
	{
	
		System.out.println(id +" "+name+" "+salary);
		
	}
	
	
	
	

}
