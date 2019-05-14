package io.example.model;

public class Person {

	String firstName;
	String LastName;
	int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", LastName=" + LastName + ", age=" + age + "]";
	}

}
