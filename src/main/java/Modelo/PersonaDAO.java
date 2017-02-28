/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Mapeo.Persona;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author gilis
 */
public class PersonaDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory (SessionFactory sf) {
		sessionFactory = sf;
	}
	
	public void guardar (Persona persona) {
		Session session = sessionFactory.openSession ();
		Transaction t = null;
		try {
			t = session.beginTransaction ();
			session.persist (persona);
			t.commit ();
		} catch (Exception e) {
			if (t != null)
				t.rollback ();
			e.printStackTrace ();
		} finally {
			session.close ();
		}
	}
	
	public Persona getPersona (String nombre) {
		Persona persona = null;
		Session session = sessionFactory.openSession ();
		Transaction t = null;
		try {
			t = session.beginTransaction ();
			String q = "FROM persona WHERE nombre = :nombre";
			Query query = session.createQuery (q);
			query.setParameter ("nombre", nombre);
			persona = (Persona) query.uniqueResult ();
			t.commit ();
		} catch (Exception e) {
			if (t != null)
				t.rollback ();
			e.printStackTrace ();
		} finally {
			session.close ();
		}
		return persona;
	}
}
