package com.doaio.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration().configure();// �������ö���
		SessionFactory sessionFactory = config.buildSessionFactory();// �����Ự����
		return sessionFactory;
	}
}
