package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dao.face.SelectKeyDao;
import web.dto.TestMember;

@Controller
public class SelectKeyController {

	private static final Logger logger = LoggerFactory.getLogger(SelectKeyController.class);
	
	@Autowired SelectKeyDao selectKeyDao;
	
	
	@RequestMapping(value="/mybatis/selectkey", method=RequestMethod.GET)
	public void selectKey() { }
	
	@RequestMapping(value="/mybatis/selectkey", method=RequestMethod.POST)
	public String insertProcess(TestMember member, Model model) {
		
		logger.info(member.toString());
		
		//전달받은 멤버정보를 회원가입
		selectKeyDao.join(member);

		//model.addAttribute("mem",member);		
		
		return "redirect:/mybatis/selectkey";
	}
}
