package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.MemberDao;
import web.dao.face.TestDao;
import web.service.face.MemberService;
import web.service.face.TestService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired MemberDao memberDao;

	@Override
	public int selectCnt() {
		return memberDao.selectCntAllMember();
	}
	

	
}
