package ch04;

public class Student {
	int hb;
	String name;
	int hn;
	
	public Student() {}
	
	public Student(int hb, String name, int hn) {
		this.hb = hb;
		this.hn = hn;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println("�й��� " + hb + "�̰� �̸��� " + name + "�̸� �г��� " + hn + "�Դϴ�.");
	}
}
