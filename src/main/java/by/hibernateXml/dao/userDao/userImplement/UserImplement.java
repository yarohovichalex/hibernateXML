package by.hibernateXml.dao.userDao.userImplement;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import by.hibernateXml.beans.UserClass;
import by.hibernateXml.dao.userDao.userConnectInterfaces.UserInterfaceDao;
import by.hibernateXml.dao.util.SessionFactoryManager;

public class UserImplement implements UserInterfaceDao{

	@Override
	public void create(UserClass entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public UserClass read(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		UserClass user = (UserClass)session.get(UserClass.class, id);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserClass> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(UserClass.class);
		return criteria.list();
	}

	@Override
	public void update(UserClass entity) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
        session.close();
//		Session session = SessionFactoryManager.getSessionFactory().openSession();
//		UserClass us =(UserClass)session.load(UserClass.class, 3);
////		System.out.println(us.getName());
//		us.setName("Dav");
////		us = entity;
//		session.flush();
//		System.out.println(us.getName());
//		session.update(us);
//		session.close();
	}

	@Override
	public void delete(UserClass id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(id);
		session.getTransaction().commit();
        session.close();
	}

}
