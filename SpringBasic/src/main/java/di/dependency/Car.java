package di.dependency;

import di.tire.GoldTire;
import di.tire.SilverTire;
import di.tire.Tire;

public class Car {

	private Tire tire;
	
	public Car() {
		//의존성 발생
	///	tire = new GoldTire(); //객체가 반드시 필요하다(의존성 주입)
		tire = new SilverTire(); //silverTire에 대한 의존성 주입
		
	}
	public String getTire() {
		return tire.getProduct()+"장착ㅋ";
	}
	
	
}
