package by.hibernateXml.beans;

import by.hibernateXml.beans.Entity.MyBeanEntity;

public class UserClass extends MyBeanEntity{
	
	private int id;
	private String name;
	private String surname;
	
	public UserClass() {
		super();
	}

	public UserClass(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
