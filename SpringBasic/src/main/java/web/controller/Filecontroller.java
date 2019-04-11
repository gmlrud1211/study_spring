package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Filecontroller {

	@RequestMapping(value="/file/fileup", method=RequestMethod.GET)
	public void fileForm() {
		
	}
	
	@RequestMapping(value="/file/fileup", method=RequestMethod.POST)
	public String fileupload() {
		
		return null;
	}
	
}
