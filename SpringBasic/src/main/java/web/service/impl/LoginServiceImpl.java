package web.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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


	@Override
	public void logout(HttpSession session) {
		
		session.invalidate();
	}


	@Override
	public int login(Model model) {
		return loginDao.login(model);
	}


	@Override
	public List<Login> selectUser() {
		return loginDao.selectUser();
	}


	
	
}
