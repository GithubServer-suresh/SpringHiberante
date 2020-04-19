package com.durga.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durga.beans.Employee;
import com.durga.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao emp=(EmployeeDao)ctx.getBean("empDao");
		/*Employee e=new  Employee();
		e.setEno(111);
		e.setEname("suresh");
		e.setEaddr("BVRM");
		e.setEsal(123);

		String status = emp.insertEmployee(e);
		System.out.println(status);
		 */
		/*Employee e=emp.searchEmployee(1131);
		if(e==null)System.out.println("Emp Not exists");
		else {
			System.out.println("Emp existed");
			System.out.println(e.getEno()+ e.getEname()+e.getEsal()+e.getEaddr());
		}*/
		
		Employee e=new Employee();
		e.setEno(112);
		e.setEname("Varma");
		e.setEsal(698);
		e.setEaddr("pune");
		String status=emp.updateEmployee(e);
		System.out.println(status);







}

}
