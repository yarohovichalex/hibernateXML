package by.hibernateXml.temp;

import java.util.List;

import by.hibernateXml.beans.UserClass;
import by.hibernateXml.dao.userDao.userImplement.UserImplement;

public class Main {

	public static void main(String[] args) {
		UserImplement user = new UserImplement();
//		user.create(new UserClass(3,"sadf", "asfd"));
		user.update(new UserClass(3, "David", "Famil"));
		List list = user.readAll();
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(0));

	}
}
