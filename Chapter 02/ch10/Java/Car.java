package ch10;

public class Car {
	
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	public int take(GasStation gasStation, int liter) {
		return gasStation.oiling(liter);
	}
}
