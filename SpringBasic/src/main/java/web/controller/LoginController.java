package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.dto.Login;
import web.service.face.LoginService;

@Controller
public class LoginController {

	@Autowired LoginService loginService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String Main() {
		
		return "login/main";
	}
	
	//회원가입정보입력
	@RequestMapping(value="/login/join", method=RequestMethod.GET)
	public void join() { }
	
	
	//회원가입처리
	@RequestMapping(value="/login/join", method=RequestMethod.POST)
	public String joinProc(Login login, Model model) {
		
		logger.info(login.toString());
		
		//회원가입
		loginService.join(login);
		
		return "redirect:/main";
	}
		
	//로그인 폼입력
	@RequestMapping(value="/login/login", method=RequestMethod.GET)
	public String login() {
		
		return "login/login";
	}

	//로그인 처리
	@RequestMapping(value="/login/login", method=RequestMethod.POST)
	public String loginProc(HttpSession session, String id, String pw, Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		int login = loginService.login(model);
		 
		 
		if(login == 1) { //로그인 성공
			session.setAttribute("login", true);
			return "redirect:/main";
		}
		
		else { //로그인 실패 
			logger.info("로그인 실패");
			return "redired:/main";
		}
		
		
		
	}

	@RequestMapping(value="/login/myPage", method=RequestMethod.GET)
	public String mypage(String id) {
		
		return "login/myPage";
	}

	
	@RequestMapping(value="/login/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		loginService.logout(session);
		
		return "redirect:/main";


	}


	
}
