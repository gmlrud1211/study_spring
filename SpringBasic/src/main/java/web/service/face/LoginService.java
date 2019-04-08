package web.service.face;

import javax.servlet.http.HttpSession;

import web.dto.Login;

public interface LoginService {

	//회원가입
	public void join(Login login);

	//로그아웃
	public void logout(HttpSession session);

	//로그인
	public boolean login(String id, String pw);

}
