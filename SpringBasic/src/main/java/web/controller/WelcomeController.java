package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome(String name, Model model) {
		model.addAttribute("data", "모델 데이터"); //jsp로 전달됨
		
		return "heekyoung"; //view네임이됨
	}
	
}
