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
		System.out.println("학번은 " + hb + "이고 이름은 " + name + "이며 학년은 " + hn + "입니다.");
	}
}
