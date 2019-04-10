package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.User;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/board/main", method=RequestMethod.GET)
	public void Main() {
		
	}
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public void BoardList() {
		
	}
	
	@RequestMapping(value="/board/interceptor/write", method=RequestMethod.GET)
	public void BoardWrite() {
		logger.info("게시글 작성 폼 입력 가능");
		
	}
	
	@RequestMapping("/board/interceptor/writeFail")
	public void writeFail() {
		logger.info("게시글 작성 페이지 접속 불가");
	}
	
	
	@RequestMapping(value="/board/login", method=RequestMethod.GET)
	public void Login() {
		
	}
	
	@RequestMapping(value="/board/login", method=RequestMethod.POST)
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
		
		return "redirect:/board/main";
		
	}
	
	
	@RequestMapping(value="/board/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {

		session.invalidate();
		
		return "redirect:/board/main";
	}
	
	
	
	
}
