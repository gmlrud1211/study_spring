package web.service.face;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import web.dto.Login;

public interface LoginService {

	//회원가입
	public void join(Login login);

	//로그아웃
	public void logout(HttpSession session);

	//로그인
	public int login(Model model);


}
