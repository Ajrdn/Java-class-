package ch01;

public class Tiger extends Mammalia{
	
	public Tiger(String name) {
		this.name = name;
	}
	
	public void hunt() {
		System.out.println(name + "이 사냥 중 입니다.");
	}
}
