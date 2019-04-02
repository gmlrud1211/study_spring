package com.heekyoung.www.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.heekyoung.www.di.tire.Tire;

public class Person {

	public static void main(String[] args) {
		//어플리케이션 컨텍스트 객체
		ApplicationContext context = null;
		
		//xml파일(스프링 빈 설정파일)에 등록된 bean정보를 읽어 어플리케이션 컨텍스트로 등록
		context = new FileSystemXmlApplicationContext("/src/main/java/com/heekyoung/www/di/xml/di.xml");
		
		System.out.println("--------------------");
		//Car 클래스 Di
		Car car = (Car) context.getBean("car"); //car라고 등록된 빈 의존성 주입
					//어느타입이 올지모르기 때문에 Object라서 Car형으로 형변환해주어야함
		//tire멤버필드 Di
		car.setTire( (Tire) context.getBean("gTire"));
		System.out.println(car.getInfo());

		
		//Car 클래스 Di
		Car car2 = (Car) context.getBean("car"); //car라고 등록된 빈 의존성 주입
					//어느타입이 올지모르기 때문에 Object라서 Car형으로 형변환해주어야함
		//tire멤버필드 Di
		car2.setTire( (Tire) context.getBean("sTire"));
		System.out.println(car2.getInfo());		
		System.out.println("--------------------");
		
		//레퍼런스확인
		System.out.println("car : "+car);
		System.out.println("car : "+car2);
		
		//장착된 타이어 확인
		System.out.println("car info : "+car.getInfo());
		System.out.println("car2 info : "+car2.getInfo());
	
		
		
	}

}
