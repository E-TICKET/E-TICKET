package model;


import hibern.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenementCategorie ec = new EvenementCategorie();
		
Categorie c = new Categorie();
c.setNbCategorie(15);
c.setNomCategorie("A");
//c.setEvenementCategorie(ec);
sauve(c);
	}
	private static void sauve(Categorie p){
		Transaction tx= null;
		Session session = HibernateUtil.currentSession();
		try{
		tx= session.beginTransaction();
		session.save(p);
		tx.commit();
		
		}
		catch(HibernateException e){
			e.printStackTrace();
			if(tx!= null && tx.isActive()) tx.rollback();
		}
	}
}
