package com.heekyoung.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HiController  {
	
	@RequestMapping(value="/test/hi",method=RequestMethod.GET) //get메소드를 동작하는 메소드가 됨
	public String hi(int num) {
		
		return "test/hi"; //접두어에 /가 붙어있기때문에  return 앞에 /는 빼줘야함
	}
	@RequestMapping(value="/test/hello",method=RequestMethod.GET) //get메소드를 동작하는 메소드가 됨
	public void hello() {
		
	}

}
