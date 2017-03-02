/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Mapeo.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author gilis
 */
public class UserDAO {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory (SessionFactory sf) {
		sessionFactory = sf;
	}
	
	public void guardar (User user) {
		Session session = sessionFactory.openSession ();
		Transaction t = null;
		try {
			t = session.beginTransaction ();
			session.persist (user);
			t.commit ();
		} catch (Exception e) {
			if (t != null)
				t.rollback ();
			e.printStackTrace ();
		} finally {
			session.close ();
		}
	}
	
	public User getUser (String correo, String password) {
		User user = null;
		Session session = sessionFactory.openSession ();
		Transaction t = null;
		try {
			t = session.beginTransaction ();
			String q = "FROM User WHERE correo = :correo AND password = :password";
			Query query = session.createQuery (q);
			query.setParameter ("correo", correo);
			query.setParameter ("password", password);
			user = (User) query.uniqueResult ();
			t.commit ();
		} catch (Exception e) {
			if (t != null)
				t.rollback ();
			e.printStackTrace ();
		} finally {
			session.close ();
		}
		return user;
	}
}
