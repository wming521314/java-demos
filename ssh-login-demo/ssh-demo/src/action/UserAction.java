package action;

import java.util.Map;

import service.IUserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.User;

public class UserAction extends ActionSupport {
	private User user;
	private String password2;
	private IUserService us;

	public String login() {
		User u = us.login(user);
		if (u != null) {
			getSession().put("login_user", u);
			return SUCCESS;
		} else {
			addActionError("用户名或密码错误！");
			return INPUT;
		}
	}

	public String regist() {
		if (password2.equals(user.getPassword())) {
			if (us.regist(user))
				return SUCCESS;
			else {
				this.addActionError("用户名已存在！");
				return INPUT;
			}
		} else {
			addActionError("两次密码不一致！");
			return INPUT;
		}
	}

	public String logout() {
		getSession().clear();
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public IUserService getUs() {
		return us;
	}

	public void setUs(IUserService us) {
		this.us = us;
	}

	private Map<String, Object> getSession() {
		return ActionContext.getContext().getSession();
	}
}
