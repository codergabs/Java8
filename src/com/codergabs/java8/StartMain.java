package com.codergabs.java8;

import java.util.ArrayList;
import java.util.List;

public class StartMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Person> roster = new ArrayList<Person>();

		Person pn1 = new Person();
		pn1.setName("gabs1");
		pn1.setAge(20);

		roster.add(pn1);

		Person pn2 = new Person();
		pn2.setName("gabs2");
		pn2.setAge(25);
		roster.add(pn2);

		printPersonsOlderThan1(roster, 18);

		printPersonsOlderThan2(roster, new CheckPerson() {
			public boolean test(Person p) {
				return p.getAge() >= 18 && p.getAge() <= 23;
			}
		});
		//lamda expression
		printPersonsOlderThan3(roster, p -> p.getAge() >= 18
				&& p.getAge() <= 25);
	}

	public static void printPersonsOlderThan1(List<Person> roster, int age) {
		System.out.println("printPersonsOlderThan1");
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}

	}

	public static void printPersonsOlderThan2(List<Person> roster,
			CheckPerson tester) {
		System.out.println("printPersonsOlderThan2");
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}

	}

	// lamda expression
	public static void printPersonsOlderThan3(List<Person> roster,
			CheckPerson tester) {
		System.out.println("printPersonsOlderThan3");
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}

	}

}
