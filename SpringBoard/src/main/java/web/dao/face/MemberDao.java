package web.dao.face;

import org.springframework.ui.Model;

import web.dto.Member;

public interface MemberDao {

	//mebmer(회원) insert
	public void insertMember(Member member);

	//로그인위하여 회원 조회
	public int login(Model model);

}
