package ch06;

public class Order {
	String ordernumber;
	String phonenumber;
	String homeaddress;
	int day;
	int time;
	int cost;
	String name;
	int number;
	
	public void showOrderInfo() {
		System.out.println("주문 접수 번호:" + ordernumber + "\n" + "주문 핸드폰 번호: " + phonenumber + "\n" + "주문 집 주소: " + homeaddress + "\n" + "주문 날짜: " + day + "\n" + "주문 시간: " + time + "\n" + "주문 가격: " + cost + "\n" + "메뉴 이름: " + name + "\n" + "메뉴 번호: " + number);
	}
}