package com.doaio.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration().configure();// 创建配置对象
		SessionFactory sessionFactory = config.buildSessionFactory();// 创建会话工厂
		return sessionFactory;
	}
}
