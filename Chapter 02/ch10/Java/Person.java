package ch10;

public class Person {
	
	int money;
	String name;
	
	public Person(int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	public void takeSubway(Subway subway) {
		money -= 1300;
		subway.take(1300); 
	}
	
	public void takeBus(Bus bus) {
		money -= 200;
		bus.take(200);
	}
	
	public void takeCar(Car car, GasStation gasStation) {
		money -= car.take(gasStation, 3);
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 잔액은 " + money + "입니다.");
	}
}
