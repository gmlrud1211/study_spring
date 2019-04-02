package com.heekyoung.www.di.xmlProperty;

import com.heekyoung.www.di.tire.Tire;

public class Car {

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
