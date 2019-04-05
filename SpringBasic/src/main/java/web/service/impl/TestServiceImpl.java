package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.TestDao;
import web.service.face.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired TestDao testDao;
	
	@Override
	public int cnt() {
		return testDao.selectCntAllEmp();
	}

	
}
