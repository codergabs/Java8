package com.codergabs.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		List<Person> roster = new ArrayList<Person>();

		Person pn5 = new Person();
		pn5.setName("gabs5");
		pn5.setAge(25);
		roster.add(pn5);
		
		Person pn7 = new Person();
		pn7.setName("gabs7");
		pn7.setAge(27);
		roster.add(pn7);
		
		Person pn1 = new Person();
		pn1.setName("gabs1");
		pn1.setAge(21);
		roster.add(pn1);
	
		Person pn4 = new Person();
		pn4.setName("gabs4");
		pn4.setAge(24);
		roster.add(pn4);
		
		Person pn9 = new Person();
		pn9.setName("gabs9");
		pn9.setAge(29);
		roster.add(pn9);
	
		Person pn6 = new Person();
		pn6.setName("gabs6");
		pn6.setAge(26);
		roster.add(pn6);
		
		Person pn2 = new Person();
		pn2.setName("gabs2");
		pn2.setAge(22);
		roster.add(pn2);
		
		Person pn3 = new Person();
		pn3.setName("gabs3");
		pn3.setAge(23);
		roster.add(pn3);

		Person pn8 = new Person();
		pn8.setName("gabs8");
		pn8.setAge(28);
		roster.add(pn8);


		List outputList = roster.stream()
				.filter(personObj -> personObj.getAge() >= 18 && personObj.getAge() <= 32)
				.peek(personObj -> System.out.println(personObj.getName() + " " + personObj.getAge()))				
				.sorted(Comparator.comparing(Person::getAge))								
				.limit(5)
				.map(personObj -> personObj.getName())
				.collect(Collectors.toList());

		System.out.println(outputList.toString());
		
		OptionalInt maxAge = roster.stream()
				.filter(personObj -> personObj.getAge() >= 18 && personObj.getAge() <= 32)
				.peek(personObj -> System.out.println(personObj.getName() + " " + personObj.getAge()))				
				.sorted(Comparator.comparing(Person::getAge))								
				.mapToInt(personObj -> personObj.getAge())
				.max();

		System.out.println(maxAge);

		Boolean age24 = roster.stream()
				.filter(personObj -> personObj.getAge() >= 18 && personObj.getAge() <= 32)
				.peek(personObj -> System.out.println(personObj.getName() + " " + personObj.getAge()))				
				.sorted(Comparator.comparing(Person::getAge))								
				.mapToInt(personObj -> personObj.getAge())
				.anyMatch(s -> s==28);

		System.out.println(age24);
		
		
		Optional<String> nameFirst = roster.stream()
				.filter(personObj -> personObj.getAge() >= 18 && personObj.getAge() <= 32)
				.peek(personObj -> System.out.println(personObj.getName() + " " + personObj.getAge()))	
				.sorted(Comparator.comparing(Person::getAge))
				.map(personObj -> personObj.getName())				
				.findFirst();

		System.out.println(nameFirst);
		
		Optional<String> nameAny = roster.stream()
				.filter(personObj -> personObj.getAge() >= 18 && personObj.getAge() <= 32)
				.peek(personObj -> System.out.println(personObj.getName() + " " + personObj.getAge()))	
				.sorted(Comparator.comparing(Person::getAge))
				.map(personObj -> personObj.getName())				
				.findAny();

		System.out.println(nameFirst);
	}

}
