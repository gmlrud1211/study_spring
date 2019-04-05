package web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.service.face.TestService;

@Controller
public class MyBatisController {
	
	@Autowired TestService testService;
	
	private static final Logger logger = LoggerFactory.getLogger(MyBatisController.class);
	
	@RequestMapping(value="/mybatis/test")
	public void test(Model model) {
		logger.info("마이바티스 설치 test");
		
		int cnt = testService.cnt();
		
		model.addAttribute("cnt",cnt);
	}
	

}
