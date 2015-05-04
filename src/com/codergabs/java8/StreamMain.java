package com.codergabs.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		List<Person> roster = new ArrayList<Person>();

		Person pn1 = new Person();
		pn1.setName("gabs1");
		pn1.setAge(20);
		roster.add(pn1);

		Person pn3 = new Person();
		pn3.setName("gabs3");
		pn3.setAge(30);
		roster.add(pn3);
		
		Person pn2 = new Person();
		pn2.setName("gabs2");
		pn2.setAge(25);
		roster.add(pn2);



		List outputList = roster.stream()
				.filter(p -> p.getAge() >= 18 && p.getAge() <= 32)
				.sorted(Comparator.comparing(Person::getAge))
				.limit(5)
				.map(Person::getName).collect(Collectors.toList());

		System.out.println(outputList.toString());
		

	}

}
