package di.setter;

import di.tire.GoldTire;

public class Person {

	public static void main(String[] args) {
		Car car = new Car();
		
		//person에서 의존성 주입
		car.setTire(new GoldTire());
		
		System.out.println(car.getTire());
	}
}
