package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.MemberDao;
import web.dao.face.TestDao;
import web.dto.Member;
import web.service.face.MemberService;
import web.service.face.TestService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired MemberDao memberDao;

	@Override
	public int selectCnt() {
		return memberDao.selectCntAllMember();
	}

	/*
	 * @Override public List<Member> selectAll() { return memberDao.selectAll(); }
	 */

	
}
