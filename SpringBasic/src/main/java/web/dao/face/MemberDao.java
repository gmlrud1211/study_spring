package web.dao.face;

import java.util.List;

import web.dto.Member;

public interface MemberDao {

public void insert(Member member);
	
	public List<Member> selectAll();
	

}
