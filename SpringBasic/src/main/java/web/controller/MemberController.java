package web.controller;


import java.util.List;

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
	
	@Autowired MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/member/insert", method=RequestMethod.GET)
	public void insertForm() { }
	
	@RequestMapping(value="/member/insert", method=RequestMethod.POST)
	public String insertProcess(Member member, Model model) {
		
		logger.info(member.toString());
		
		//전달받은 멤버정보를 회원가입
		memberService.join(member);
	
		return "redirect:/member/list";
	}
	
	@RequestMapping(value="/member/list")
	public void list(Model model) {
		
		model.addAttribute("member", memberService.getMember());
		
	}

}
