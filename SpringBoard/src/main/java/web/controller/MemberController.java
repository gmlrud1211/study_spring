package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.Member;
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
	public String LoginProc(HttpSession session, 
							String id, String pw,
							Model model) {
		
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		
		int login = memberService.login(model);
		
		if(login == 1) { //로그인 성공
			session.setAttribute("login", true);
			logger.info("로그인 성공");
			
			return "redirect:/member/main";
		}
		
		else { //로그인 실패 
			logger.info("로그인 실패");
			
			return "redirect:/member/main";
		}
		
	}
	
	@RequestMapping(value="/member/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		memberService.logout(session);
		
		return "redirect:/member/main";
	}
	
	
	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public void Join() {
		
	}
	
	@RequestMapping(value="/member/join", method=RequestMethod.POST)
	public String JoinProc(Member member, Model model) {
		
		logger.info(member.toString());
		
		//전달받은 멤버정보를 회원가입
		memberService.join(member);
		
	
		return "redirect:/member/main";
	}
	
	
}
