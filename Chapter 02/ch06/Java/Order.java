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
		System.out.println("�ֹ� ���� ��ȣ:" + ordernumber + "\n" + "�ֹ� �ڵ��� ��ȣ: " + phonenumber + "\n" + "�ֹ� �� �ּ�: " + homeaddress + "\n" + "�ֹ� ��¥: " + day + "\n" + "�ֹ� �ð�: " + time + "\n" + "�ֹ� ����: " + cost + "\n" + "�޴� �̸�: " + name + "\n" + "�޴� ��ȣ: " + number);
	}
}