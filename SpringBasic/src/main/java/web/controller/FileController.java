package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
	

	@RequestMapping(value="/file/fileup", method=RequestMethod.GET)
	public void fileForm() {
		
	}
	
	@RequestMapping(value="/file/fileup", method=RequestMethod.POST)
	public String fileupload(MultipartFile file) {
		logger.info("파일업로드!");
		
		logger.info(file.getName());
		logger.info(file.getOriginalFilename());
		logger.info(String.valueOf(file.getSize()));
		logger.info(file.getContentType());
		logger.info(String.valueOf(file.isEmpty()));
		
		return null;
	}
	
}
