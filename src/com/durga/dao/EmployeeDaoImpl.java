package com.durga.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.durga.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private HibernateTemplate ht;
	private String status="";
	
	


	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	@Override
	public String insertEmployee(Employee emp) {
		Integer in=(Integer)ht.save(emp);
		if(in==emp.getEno()) {
			status="Success";
		}
		else {
			status="failure";
		}
		return status;
	}

	@Transactional
	@Override
	public Employee searchEmployee(int eno) {
		Employee emp=(Employee)ht.get(Employee.class, eno);
		return emp;
	}

	@Transactional
	@Override
	public String updateEmployee(Employee emp) {
		ht.update(emp);
		status="success";
		return status;
	}

	@Transactional
	@Override
	public Employee deleteEmployee(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

}
