package com.durga.dao;



import com.durga.beans.Employee;

public interface EmployeeDao {

	
	public String insertEmployee(Employee emp);
	public Employee searchEmployee(int eno);
	public String updateEmployee(Employee emp); 
	public Employee deleteEmployee(int eno);
	
}
