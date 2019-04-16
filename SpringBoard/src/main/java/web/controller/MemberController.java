package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.service.face.MemberService;

@Controller
public class MemberController {

	
private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired MemberService memberService;
	
	@RequestMapping(value="/member/main", method=RequestMethod.GET)
	public void Main() {
		
	}
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public void Login() {
		
	}

	@RequestMapping(value="/member/login", method=RequestMethod.POST)
	public void LoginProc() {
		
	}
	
}
