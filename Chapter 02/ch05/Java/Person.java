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
		System.out.println("Ű�� " + tell + "�̰� �����԰�  " + wigth + "kg�� " + genter + "�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
	}
}
