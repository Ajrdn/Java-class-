package ch08;

public class StudentTest {

	public static void main(String[] args) {
		
		Student minho = new Student(100, "minho", 1);
		Student kim = new Student(200, "kim", 2);
		
		kim.setName("gim");
		
		minho.showStudentInfo();
	}

}
