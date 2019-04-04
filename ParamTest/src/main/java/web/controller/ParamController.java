package web.controller;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web.dto.Person;

@Controller
public class ParamController {
	
	private static final Logger logger = LoggerFactory.getLogger(ParamController.class);
	
	@RequestMapping(value="/param/requestParam", method=RequestMethod.GET)
	public String test (String name) {
		
		return "/param/paramForm";
	}
	
	@RequestMapping(value="/param/requestParam", method=RequestMethod.POST)
	public String Result (String name, int age, 
						Model model,
						@ModelAttribute Person person, 
						@RequestParam HashMap<String, String> map) { //map앞에는 꼭 requestParam붙여줘야함
		
		logger.info("name : "+name);
		logger.info("age : "+age);
		
		logger.info(person.toString());
		logger.info(map.toString());
		
		model.addAttribute("n",name);
		model.addAttribute("a",age);
		model.addAttribute("m",map);
		
		return "/param/paramResult";
	}

	@RequestMapping(value="/param/required")
	public String paramTest (
								@RequestParam(value="t", required=true, defaultValue="abc") String test,
								Writer out) {
		logger.info("파라미터 테스트");
		
		logger.info(test);

		
		try {
			out.write("<h2 >Testing... </h2>");
		} catch (IOException e) { 
			e.printStackTrace();
		}
		

		return null;
	}
	
}
