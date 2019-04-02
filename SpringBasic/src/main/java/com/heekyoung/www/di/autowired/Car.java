package com.heekyoung.www.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.heekyoung.www.di.tire.Tire;

public class Car {

	@Qualifier("gTire") //세가지 보조역할이라 다 사용가능(이름골라줌~)

	//@Autowired : 
	//@Resource :
	//@Inject : 
	
	
	@Autowired
	private Tire tire;
	
	public String getInfo() {
		return tire.getProduct() +"장착ㅋ";
	}
	
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
}
