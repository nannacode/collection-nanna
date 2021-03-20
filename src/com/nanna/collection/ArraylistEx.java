package com.nanna.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraylistEx {

	private static Iterator<String> iterator;
	void testData() { 
		
	}
//	int a[] ;
	public static void main(String[] args) {
		
		List<String> arrys = new ArrayList<>();
		arrys.add("Nanna");
		arrys.add("bapi");
		arrys.add("bapu");
		arrys.add("kfjj");
		arrys.add("10");
		arrys.add("Nannakassjdkljd");
		ArrayList<Integer> li = new ArrayList<>();
		li.ensureCapacity(3);
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(140);
		li.add(430);
//		arrys.remove(2);
//		li.remove(Integer.valueOf(20));
//		arrys.remove("bapi");
//		arrys.removeAll(li);
//		System.out.println(li);
//		li.removeIf(g -> g%30==0);
		Object[] array2 = li.toArray();
		System.out.println(Arrays.toString(array2));
		
//		System.out.println(array[]);
//		System.out.println(arrys);
//		System.out.println(li);
//		System.out.println(li.indexOf(4));
		

	}
	
	
			
}
