package com.heekyoung.www.di.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.heekyoung.www.di.tire.Tire;

public class Person {

	public static void main(String[] args) {
		//어플리케이션 컨텍스트 객체
		ApplicationContext context = null;
		
		//xml파일(스프링 빈 설정파일)에 등록된 bean정보를 읽어 어플리케이션 컨텍스트로 등록
		context = new FileSystemXmlApplicationContext("/src/main/java/com/heekyoung/www/di/autowired/di.xml");
		
		//Car 클래스 DI
		Car car = (Car) context.getBean("car");
			
		//레퍼런스확인
		System.out.println("car : "+car);
		
		//장착된 타이어 확인
		System.out.println("car info : "+car.getInfo());
	
		
		
	}

}
