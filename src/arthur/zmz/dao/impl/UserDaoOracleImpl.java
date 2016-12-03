package arthur.zmz.dao.impl;

import arthur.zmz.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {

	@Override
	public void getUser() {
		System.out.println("oracle获取用户数据");
	}

}
