package ch07;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Lee = new Student("ÀÌ", 1);
		Student Kim = new Student("±ט", 2);
		
		Lee.setKoreanScore(100);
		Lee.setmathScore(100);
		
		Kim.setKoreanScore(90);
		Kim.setmathScore(95);
		
		Lee.showStudentScore();
		Kim.showStudentScore();

	}

}
