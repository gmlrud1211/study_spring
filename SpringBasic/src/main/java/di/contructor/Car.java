package di.contructor;

import di.tire.GoldTire;
import di.tire.SilverTire;
import di.tire.Tire;

public class Car {

	private Tire tire;
	
	public Car(Tire tire){
		this.tire = tire; //생성자를 이용해서 의존성 주입
	}
	public String getTire() {
		return tire.getProduct()+"장착ㅋ";
	}
	
	
}
