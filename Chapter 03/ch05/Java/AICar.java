package ch05;

public class AICar extends Car{

	public void drive() {
		System.out.println("자율주행을 시작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자율주행을 멈춥니다.");
	}
	
	
}
