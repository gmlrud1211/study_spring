package web.service.face;

import java.util.List;

import web.dto.Member;

public interface MemberService {

	public void join(Member member);
	
	public List<Member> getMember();
}
