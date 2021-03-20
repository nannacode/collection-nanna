package com.nanna.collection2;



public class Student implements Comparable<Student>{

	
		private int age; 
		private String name ; 
		private String rollNo;
		public Student(int age, String name, String rollNo) {
			super();
			this.age = age;
			this.name = name;
			this.rollNo = rollNo;
		}
		public int getAge() {
			return age;
		}
		public String getName() {
			return name;
		}
		public String getRollNo() {
			return rollNo;
		}
		@Override
		public String toString() {
			return "Student [age=" + age + ", name=" + name + ", rollNo=" + rollNo + "]";
		}
		@Override
		public int compareTo(Student o) {
				
			return name.compareTo(o.getName());
		}
		
		
//		@Override
//		public int compareTo(Student o) {
//			if (age==o.age) {
//				return 0;
//			}
//			else if (age<o.age) { 
//				return -1;
//			}
//			else
//				return 1;
//			
//		} 
	
		
		
		
}
