package com.cg.employeelist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;




public class Employeedetailssort {

	public static void main(String[] args) {
ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee (02,"rakesh",300.0));
		emp.add(new Employee(04,"Kushboo",460.0));
		emp.add(new Employee(05,"bara",350.0));
		emp.add(new Employee(03,"muskan",9000.0));
		
		
		
		Iterator<Employee> it = emp.iterator(); 
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(emp);
		  
		  System.out.println("------");
		  
		  it = emp.iterator();  
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(emp);
	}
	

	





	}


