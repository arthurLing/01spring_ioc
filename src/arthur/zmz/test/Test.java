package arthur.zmz.test;

import arthur.zmz.dao.impl.UserDaoMysqlImpl;
import arthur.zmz.dao.impl.UserDaoOracleImpl;
import arthur.zmz.service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.setUserDao(new UserDaoMysqlImpl());
		userServiceImpl.getUser();
		System.out.println("----------");
		userServiceImpl.setUserDao(new UserDaoOracleImpl());
		userServiceImpl.getUser();
	}

}
