package dao;

import java.util.List;
import java.util.Properties;

import entity.User;

public interface IUserDao {
	List<User> findAll();
	User find(int id);
	List<User> find(Properties prop);
	void add(User u);
	void chage(User u);
	void delete(User u);
}
