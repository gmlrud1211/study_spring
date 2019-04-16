package web.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import web.dao.face.MemberDao;
import web.dto.Member;
import web.service.face.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired MemberDao memberDao;

	@Override
	public void join(Member member) {
		memberDao.insertMember(member);
	}

	@Override
	public int login(Model model) {
		return memberDao.login(model);
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();		
	}
	
}
