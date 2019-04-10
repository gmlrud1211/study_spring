package web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import web.controller.BoardController;


@Controller
public class BoardInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.info("interceptor 시작");
		
		//세션얻기
		HttpSession session =request.getSession() ;//세션가져오기
		
		if( session.getAttribute("login") == null ) {
			logger.info(" >> 접속불가 : 로그인되지 않음");
			
			response.sendRedirect("/board/interceptor/writeFail");
			
			return false; //컨트롤러 접근 차단
			
		} else {
			logger.info(" >> 로그인 상태");
			
			if(!"관리자".equals(session.getAttribute("nick"))) {
				logger.info(" >> 접속불가 : 일반사용자 로그인 상태");
				
				response.sendRedirect("/board/interceptor/write");
				
				return false; //컨트롤러 접근 차단
				
			}
		}
	

		
		return true;
	}
	
}
