package com.nanna.collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {

		List<StudentO> nannaStudent = new ArrayList<>();

//					nannaStudent.add(new Student(29, "Nanna Dash", "36")); 
//					nannaStudent.add(new Student(28, "Bapu das", "5"));
//					nannaStudent.add(new Student(34, "Bapi das", "2"));
//					nannaStudent.add(new Student(23, "Amrit", "90"));
//					nannaStudent.add(new Student(45, "hello bro ", "45"));
//					System.out.println(nannaStudent);
//					Collections.sort(nannaStudent);
//					for (Student student : nannaStudent) {
//						System.out.println(student);
//					}
//					System.out.println(nannaStudent);

		nannaStudent.add(new StudentO("Nanna Dash", 21, 21000));
		nannaStudent.add(new StudentO("bapu Dash", 24, 30000));
		nannaStudent.add(new StudentO("Anikesw", 31, 32000));
		nannaStudent.add(new StudentO("Foihuj", 23, 28000));
		nannaStudent.add(new StudentO("khufru", 26, 28600));
		nannaStudent.add(new StudentO("poijhug", 34, 256000));
		System.out.println("UN-ORDERED  :");
		for (StudentO studentO : nannaStudent) {
			System.out.println(studentO);
		}
		System.out.println("_____________________________");
		System.out.println("_____________________________");
		Collections.sort(nannaStudent);
		System.out.println("ORDERED :");
		for (StudentO studentO : nannaStudent) {
			System.out.println(studentO);
		}

	}

}

/*
 * 
 * List<Integer> arraylist = new ArrayList<Integer>(); arraylist.add(23);
 * arraylist.add(3); arraylist.add(4); arraylist.add(90); arraylist.add(33);
 * arraylist.add(63); arraylist.add(123); List<String> nanna = new
 * ArrayList<>(); nanna.add("ab"); nanna.add("aa"); nanna.add("ghj");
 * nanna.add("nkn"); System.out.println(nanna); System.out.println(arraylist);
 * Collections.sort(arraylist); Collections.sort(nanna);
 * System.out.println(arraylist); System.out.println(nanna);
 * 
 */
