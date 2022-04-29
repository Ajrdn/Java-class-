package ch06;

public class CalcTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		Calc a = new CompleteCalc();
		
		System.out.println(num1 + " + " + num2 + " = " + a.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + a.substract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + a.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + a.divide(num1, num2));
	}

}
