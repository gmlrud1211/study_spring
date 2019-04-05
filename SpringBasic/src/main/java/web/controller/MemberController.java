package web.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.service.face.MemberService;

@Controller
public class MemberController {
	
	@Autowired MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/member/test", method=RequestMethod.GET)
	public void test(Model model) {
		logger.info("memberTest");
		
		int cnt = memberService.selectCnt();
		
		model.addAttribute("cnt",cnt);
		
		
	}
	

}
