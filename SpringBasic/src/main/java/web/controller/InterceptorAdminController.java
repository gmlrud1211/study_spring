package web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class InterceptorAdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/interceptor/admin/main", method=RequestMethod.GET)
	public void adminMain() {
		
		logger.info("관리자페이지시작");
		
	}
	
	@RequestMapping("/interceptor/admin/adminFail")
	public void adminFail() {
		logger.info("관리자 페이지 접속 실패");
	}
	
}
