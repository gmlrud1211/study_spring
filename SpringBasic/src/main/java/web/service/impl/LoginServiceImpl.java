package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.LoginDao;
import web.dto.Login;
import web.service.face.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired LoginDao loginDao;

	@Override
	public void join(Login login) {
		loginDao.insert(login);
	}
	
	

	
}
