package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/board/main", method=RequestMethod.GET)
	public void Main() {
		
	}
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public void BoardList() {
		
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public void BoardWrite() {
		
	}
	

	
	
}
