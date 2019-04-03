package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParamController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/param/requestParam", method=RequestMethod.GET)
	public String test (String name, Model model) {
		model.addAttribute("param 제출페이지", "페이지 잘열림"); //jsp로 전달됨
		
		return "/param/paramForm";
	}
	
	@RequestMapping(value="/param/requestParam", method=RequestMethod.POST)
	public String Result (String name, Model model) {
		
		model.addAttribute("model", "페이지 잘열림"); //jsp로 전달됨
		model.addAttribute("name", name); //jsp로 전달됨
		
			
		logger.info("name : "+name);
		
		return "/param/paramResult";
	}

}
