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
		System.out.println(number + "ȣ�� ����ö�� ���� �ܾ��� " + money + "�̰�, �°����� " + passengerCount + "���Դϴ�.");
	}
}
