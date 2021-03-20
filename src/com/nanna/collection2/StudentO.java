package com.nanna.collection2;

public class StudentO implements Comparable<StudentO> {

	
	private String name; 
	private int id; 
	private int fees;
	public StudentO(String name, int id, int fees) {
		super();
		this.name = name;
		this.id = id;
		this.fees = fees;
	}
	public int getFees() {
		return fees;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "StudentO [name= " + name + ", id= " + id + ", fees=" + fees + "]";
	}
	@Override
	public int compareTo(StudentO o) {
		if(fees==o.fees) {
			return 0;
		}
		else if(fees<o.fees) {
			return -1;
			
		}
		else {
			return 1;
		}
		
		
	}
	
	
}
