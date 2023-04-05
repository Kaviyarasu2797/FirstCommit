package org.datatable;

import java.util.ArrayList;
import java.util.List;

public class WithOutHeader {

	public static void main(String[] args) {
	
		List<ArrayList<String>> emp = new ArrayList<ArrayList<String>>();
		// insert into inner list
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ram");
		a1.add("Ram@gmail.com");
		a1.add("java");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("sam");
		a2.add("sam@gmail.com");
		a2.add("api");
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("raj");
		a3.add("raj@gmail.com");
		a3.add("api");
	
		//insert into outer list
		
		emp.add(a1);
		emp.add(a2);
		emp.add(a3);
		
		System.out.println(emp);
		
		
		
		
		
		
		
	}
	
	
	
}
