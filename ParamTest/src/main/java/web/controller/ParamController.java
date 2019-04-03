package web.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String Result (String name, int age, Person person, 
						@RequestParam HashMap<String, String> map) { //map앞에는 꼭 requestParam붙여줘야함
		
		logger.info("name : "+name);
		logger.info("age : "+age);
		
		logger.info(person.toString());
		logger.info(map.toString());
		
		return "/param/paramResult";
	}

}
