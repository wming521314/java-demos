package service;

import entity.User;

public interface IUserService{

	User login(User u);
	boolean regist(User u);
}
