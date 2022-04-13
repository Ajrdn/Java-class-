package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student minho = new Student(100, "minho", 1);
		
		minho.hb = 100;
		minho.name = "minho";
		minho.hn = 1;
		
		minho.showStudentInfo();
	}

}
