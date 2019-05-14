package io.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.example.model.Person;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(
				new Person("Rohit", "Kumar" , 25),
				new Person("Ravi" ,"Singh" , 26),
				new Person("Pravin" ,"Jha", 27));
		
		// sort the list by last name
		
		Collections.sort(person,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//create a method that print all  elements in the list
		System.out.println("print all the person");
		printConditonally(person , p -> true);
		
		// create a method that print people that have last name start with J
		System.out.println(" print all the person start with J");
		printConditonally(person , p -> p.getLastName().startsWith("J"));
		
		System.out.println("print all the person start with S conditionally");
		printConditonally(person,p2 -> p2.getLastName().startsWith("S"));
		
	}

	private static void printConditonally(List<Person> person, Condition condition) {
		for(Person person3 : person) {
			if(condition.test(person3)) {
				System.out.println(person3);
			}
		}
		
	}	
}

 
