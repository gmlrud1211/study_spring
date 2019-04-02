package di.setter;

import di.tire.GoldTire;
import di.tire.SilverTire;
import di.tire.Tire;

public class Car {

	private Tire tire;
	
	public void setTire(Tire tire) {
		this.tire= tire; //setter을 이용한 의존성 주입
	}
	
	public String getTire() {
		return tire.getProduct()+"장착ㅋ";
	}
	
	
}
