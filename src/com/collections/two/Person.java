package com.collections.two;
 
public class Person  implements Comparable<Person>{
 
    private int age;
    private String name;
 
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return this.age-person.getAge();
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 

}