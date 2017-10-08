package service.impl;

import java.util.List;
import java.util.Properties;

import service.IUserService;
import dao.IUserDao;
import entity.User;

public class UserServiceImpl implements IUserService {
	private IUserDao ud;

	public User login(User u) {
		Properties prop = new Properties();
		prop.setProperty("username", u.getUsername());
		prop.setProperty("password", u.getPassword());
		List<User> users = ud.find(prop);

		if (users.isEmpty())
			return null;
		else
			return users.get(0);
	}

	public boolean regist(User u) {
		Properties prop = new Properties();
		prop.setProperty("username", u.getUsername());
		List<User> users = ud.find(prop);

		if (users.isEmpty()) {
			ud.add(u);
			return true;
		} else
			return false;

	}

	public IUserDao getUd() {
		return ud;
	}

	public void setUd(IUserDao ud) {
		this.ud = ud;
	}

}
