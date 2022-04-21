package ch12;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company google, kakao, apple;
		google = Company.getInstance();
		kakao = Company.getInstance();
		apple = Company.getInstance();
		
		System.out.println(google);
		System.out.println(kakao);
		System.out.println(apple);
	}

}
