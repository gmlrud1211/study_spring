package web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.service.face.MemberService;
import web.service.face.TestService;

@Controller
public class MemberController {
	
	@Autowired MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/member/test")
	public void test(Model model) {
		logger.info("memberTest");
		
		int cnt = memberService.selectCnt();
		
		model.addAttribute("cnt",cnt);
	}
	

}
