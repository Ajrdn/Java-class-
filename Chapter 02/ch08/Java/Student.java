package ch08;

public class Student {
	
	private int hb;
	private String name;
	private int hn;
	
	public Student() {}
	
	public Student(int hb, String name, int hn) {
		this.hb = hb;
		this.hn = hn;
		this.name = name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getHb() {
		return hb;
	}

	public void setHb(int hb) {
		this.hb = hb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHn() {
		return hn;
	}

	public void setHn(int hn) {
		this.hn = hn;
	}

	public String getname() {
		return name;
	}
	
	public void showStudentInfo() {
		System.out.println("학번은 " + hb + "이고 이름은 " + name + "이며 학년은 " + hn + "입니다.");
	}
}
