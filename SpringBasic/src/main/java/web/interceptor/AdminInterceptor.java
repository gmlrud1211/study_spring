package web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import web.controller.MemberController;

public class AdminInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.info("interceptor 시작");
		
		//세션얻기
		HttpSession session  ;//세션가져오기
		
		return true;
		//preHandle 메소드의 반환값
		//true - 컨트롤러 접근 허용
		//false - 컨트롤러 접근 차단
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		logger.info("interceptor 종료");
		
		
	}
}
