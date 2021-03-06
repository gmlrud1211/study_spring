package web.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.MemberDao;
import web.dto.Member;
import web.service.face.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired MemberDao memberDao;
	
	@Override
	public void join(Member member) {
		memberDao.insert(member);
	}

	@Override
	public List<Member> getMember() {

//		Member member = new Member();
//		member.setName("회원1");
//		member.setEmail("이");
		
//		HashMap map = new HashMap();
//		map.put("name", "회원1");
//		map.put("email", "이");

		String[] names= {"회원1","회원2","회원3"};
		HashMap map = new HashMap();
		map.put("arr", names);
		
		
//		return memberDao.selectAll();	
		
//		return memberDao.selectByName(member);
//		return memberDao.selectByName(map);
		
//		return memberDao.selectByName("회원1","이");
		return memberDao.selectByName(map);
		
	}

}
