package ch05;

public class Person {
	int tell;
	String name;
	int wigth;
	String genter;
	int age;
	
	public Person(int tell, String name, int wigth, String genter, int age) {
		this.tell = tell;
		this.name = name;
		this.wigth = wigth;
		this.genter = genter;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println("키가 " + tell + "이고 몸무게가  " + wigth + "kg인 " + genter + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}
}
