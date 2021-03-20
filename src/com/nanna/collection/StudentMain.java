package com.nanna.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentMain {

	
	
	public static void main(String[] args) {
		
		List<Student> nanna = new ArrayList<Student>(); 
		nanna.add(new Student(25, "JItM", "nanna",new Address("Bhubaneswar")));
		nanna.add(new Student(22, "ACC", "bapu" ,new Address("odisha")));
		nanna.add(new Student(24, "BSD", "bapi" ,new Address("Bhawanipatna")));
		System.out.println(nanna);
//		Student data = nanna.get(1);
//		System.out.println("At Index ! 1");
		Iterator<Student> student = nanna.iterator();
		while (student.hasNext()) {
			Student nannaBhai = student.next();
			System.out.println(nannaBhai.getName()+" ---"+nannaBhai.getSchool()+"*****"+nannaBhai.getAddress().getCity());
//			
//			System.out.println(student.next().getSchool());
		}
	}
}
