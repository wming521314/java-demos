package dao.impl;

import java.util.List;
import java.util.Properties;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.IUserDao;
import entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements IUserDao {

	public List<User> findAll() {
		return getHibernateTemplate().loadAll(User.class);
	}

	public User find(int id) {
		return (User) getHibernateTemplate().get(User.class, id);
	}

	public List<User> find(Properties prop) {
		return getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(User.class).add(
						Expression.allEq(prop)));
	}

	public void add(User u) {
		getHibernateTemplate().save(u);

	}

	public void chage(User u) {
		getHibernateTemplate().update(u);

	}

	public void delete(User u) {
		getHibernateTemplate().delete(u);

	}

}
