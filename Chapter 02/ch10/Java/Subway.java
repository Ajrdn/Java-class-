package ch10;

public class Subway {
	
	int money;
	int number;
	int passengerCount;
	
	public Subway(int number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(number + "호선 지하철의 현재 잔액은 " + money + "이고, 승객수는 " + passengerCount + "명입니다.");
	}
}
