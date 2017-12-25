package com.doaio.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.doaio.entity.Admin;
import com.doaio.util.MySessionFactory;


public class LoginAction extends SuperAction {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	// ึ๗าณ
	public String index() throws Exception {
		return "index";
	}
	
	@Test
	public void test(){
		SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Admin");
		List list = query.list();
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(((Admin)list.get(i)).getUsername());
			System.out.print(":");
			System.out.println(((Admin)list.get(i)).getPassword());
		}
//		try {
//			tx.commit();
//		} catch (Exception e) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
//		System.out.println(list);
	}

}
