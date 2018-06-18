package by.hibernateXml.dao.connectInterfaces;

import java.util.List;

import by.hibernateXml.beans.Entity.MyBeanEntity;

public interface BaseDao<T extends MyBeanEntity> {
	
	void create(T entity);

	T read(int id);

	List<T> readAll();

	void update(T entity);

	void delete(T entity);
}
