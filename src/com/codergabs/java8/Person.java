package com.codergabs.java8;

public class Person {


    String name;

    Integer age;

    public int getAge() {

    	return this.age;
    }

    public void printPerson() {
        System.out.println("Name : "+this.name);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
