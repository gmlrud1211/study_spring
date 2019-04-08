package web.service.impl;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

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


	@Override
	public void logout(HttpSession session) {
		
		session.invalidate();
	}


	@Override
	public boolean login(String id, String pw) {
		HashMap<String, Object> result = loginDao.selectId(id);
		if(result == null)
		{
			return false;
		}
		else {
			String pwd = (String)result.get()
		}
		
		return false;
	}

	
	

	
}
