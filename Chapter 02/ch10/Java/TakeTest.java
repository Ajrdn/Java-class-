package ch10;

public class TakeTest {

	public static void main(String[] args) {
		
		Person p1 = new Person(5000, "yesterdayMrchoi");
		Person p2 = new Person(20000, "todayMrchoi");
		
		Subway Three = new Subway(3);
		Bus bus7_2 = new Bus("7-2");
		Car myCar = new Car("myCar");
		GasStation suyeong = new GasStation("suyeong");
		
		p1.takeSubway(Three);
		p1.takeBus(bus7_2);
		p2.takeCar(myCar, suyeong);
		
		p1.showInfo();
		p2.showInfo();
		
		Three.showInfo();
		bus7_2.showInfo();
		suyeong.showInfo();
	}

}
