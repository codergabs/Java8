package com.codergabs.java8;

@FunctionalInterface
public interface CheckPerson {
	// one abstract method
	boolean test(Person p);
	//default method
	default boolean defaulttest(Person p){
		if (p==null){
			return false;
		}
		return true;
	}		
}
