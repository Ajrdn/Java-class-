package ch01;

public class Person extends Mammalia{
	
	public Person(String name) {
		this.name = name;
	}
	
	public void drive() {
		System.out.println(name + "님이 운전 중 입니다.");
	}
}
