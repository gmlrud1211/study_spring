package web.service.face;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import web.dto.Member;

public interface MemberService {

	//회원가입 처리
	public void join(Member member);

	//로그인 처리
	public int login(Model model);

	//로그아웃 처리
	public void logout(HttpSession session);

}
