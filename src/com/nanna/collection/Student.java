package com.nanna.collection;

public class Student {

	private String name;
	private String school;
	private int age;
	private Address address;

	public Student(int age, String school, String name, Address adress) {

		this.age = age;
		this.name = name;
		this.school = school;
		this.address = adress;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSchool() {
		return school;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", school=" + school + ", age=" + age + ", address=" + address.getCity() + "]";
	}
}
