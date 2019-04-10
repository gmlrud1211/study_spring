package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.User;

@Controller
public class InterceptorTestController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/interceptor/main", method=RequestMethod.GET)
	public void Main() {
		
	}
		
	
	@RequestMapping(value="/interceptor/login", method=RequestMethod.GET)
	public String Login() {
		
		return "interceptor/login";
	}
	
	@RequestMapping(value="/interceptor/login", method=RequestMethod.POST)
	public String LoginProc(User user, HttpSession session) {
		logger.info(user.toString());
		
		if("abc".equals(user.getId())) {
			//일반 사용자 경우
			logger.info("일반사용자 로그인 성공");
			
			session.setAttribute("login", true);
			session.setAttribute("nick", "희경");
		
		} else if("admin".equals(user.getId())) {
			//관리자
			logger.info("관리자 로그인 성공");
		
			session.setAttribute("login", true);
			session.setAttribute("nick", "관리자");
		} else {
			logger.info("로그인 실패");
		}
		
		return "redirect:/interceptor/main";
		
	}
	
	
	@RequestMapping(value="/interceptor/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {

		session.invalidate();
		
		return "redirect:/interceptor/main";
	}
	
	
	
	
}
