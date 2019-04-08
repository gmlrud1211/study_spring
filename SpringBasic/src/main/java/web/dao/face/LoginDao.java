package web.dao.face;

import java.util.List;

import org.springframework.ui.Model;

import web.dto.Login;

public interface LoginDao {

	//회원가입 정보 DB에 삽입
	public void insert(Login login);

	//로그인 ㅊ ㅓ리
	public int login(Model model);

	//로그인한 회원 정보조회
	public List<Login> selectUser();


}
