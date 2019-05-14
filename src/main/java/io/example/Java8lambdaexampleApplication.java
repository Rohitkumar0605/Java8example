package io.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.example.model.Person;

public class Java8lambdaexampleApplication {

	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(
				new Person("Rohit", "Kumar" , 25),
				new Person("Ravi" ,"Singh" , 26),
				new Person("Pravin" ,"Jha", 27));
		
		// sort the list by last name
		
		Collections.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}	
		});
		
		//create a method that print all  elements in the list
		System.out.println("print all the person");
		printAll(person);
		
		// create a method that print people that have last name start with J
		System.out.println(" print all the person start with J");
		printLastNameStartWithJ(person);
		
		System.out.println("print all the person start with S conditionally");
		printConditonally(person,new Condition() {

			@Override
			public boolean test(Person p2) {
				return p2.getLastName().startsWith("S");
			}
			
		});
		
	}

	private static void printConditonally(List<Person> person, Condition condition) {
		for(Person person3 : person) {
			if(condition.test(person3)) {
				System.out.println(person3);
			}
		}
		
	}

	private static void printLastNameStartWithJ(List<Person> person) {
		for (Person person2 : person) {
			  if(person2.getLastName().startsWith("J")) { System.out.println(person2); }
	
		}
		
	}

	private static void printAll(List<Person> person) {
		for (Person person2 : person) {
			System.out.println(person2);
		}
	}
	
}

 interface Condition{
	 boolean test(Person p2);
 }
