package arthur.zmz.service.impl;

import arthur.zmz.dao.UserDao;
import arthur.zmz.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao UserDao = null;
	
	public void setUserDao(UserDao userDao) {
		UserDao = userDao;
	}
	
	@Override
	public void getUser() {
		UserDao.getUser();
	}

}
