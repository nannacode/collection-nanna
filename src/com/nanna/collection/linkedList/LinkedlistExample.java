package com.nanna.collection.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedlistExample {

	
	public static void main(String[] args) {
		
		
		
		List<String> nanna = new LinkedList<>();
		nanna.add("1- nanna Dash"); 
		nanna.add("2 -bapu das"); 
		nanna.add("3 -bapi Dash"); 
		nanna.add("4 -Dash  babu"); 
		
		
		ListIterator<String> nannaBhai = nanna.listIterator();
		System.out.println("__________");
		while (nannaBhai.hasNext()) {
			System.out.println(nannaBhai.next());
			
		}
		while (nannaBhai.hasPrevious()) {
			System.out.println(nannaBhai.previous());
			
		}
		
		
		
	}
}
