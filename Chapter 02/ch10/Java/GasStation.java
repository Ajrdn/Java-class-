package ch10;

public class GasStation {
	int money;
	int oilCount;
	String address;
	
	public GasStation(String address) {
		this.address = address;
		oilCount = 10;
	}
	
	public int oiling(int liter) {
		oilCount -= liter;
		money += liter * 6000;
		return liter * 6000;
	}
	
	public void showInfo() {
		System.out.println(address + "������ �����Ҵ� ���� " + oilCount + "���� ��ŭ ������ �ְ�, �ܾ��� " + money + "���Դϴ�.");
	}
}