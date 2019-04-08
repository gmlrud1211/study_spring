package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.service.face.LoginService;

@Controller
public class LoginController {

	@Autowired LoginService loginService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String Main() {
		
		return "login/main";
	}


	public void login() {
		
	}

	public void loginProc(String id, String pw) {
		
		
	}
	public String mypage(String id) {
		
		return "login/mypage";
	}

	public void logout() {
		
			
	}

	
	
	
	
}
