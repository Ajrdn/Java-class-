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
		System.out.println(address + "지점의 주유소는 현재 " + oilCount + "리터 만큼 가지고 있고, 잔액은 " + money + "원입니다.");
	}
}
