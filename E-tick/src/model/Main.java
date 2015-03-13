package model;


import java.util.Collection;

import hibern.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IServiceObject;



import categorie.Categorie;
import evenement.Evenement;
import evenementcategorie.EvenementCategorie;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EvenementCategorie ec = new EvenementCategorie();
		
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
		}*/
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		IServiceObject categorieService=(IServiceObject)context.getBean("categorieService");
		EvenementCategorie ec = new EvenementCategorie();
		
		Categorie c = new Categorie();
		c.setNbCategorie(4);
		c.setNomCategorie("C");
		categorieService.create(c);
		
		// Evenement :
	
		IServiceObject evenementService=(IServiceObject)context.getBean("evenementService");
		Evenement e = new Evenement();
		e.setNomEvenement("Match");
		e.setPrixMin(25);
		e.setQteStock(20);
		evenementService.create(e);
		
		IServiceObject evenementcategorieService=(IServiceObject)context.getBean("evenementcategorieService");
		EvenementCategorie evc = new EvenementCategorie();
		evc.setPrix(123);
		evc.setCategorieA(c);
		evc.setEvenementB(e);
		evenementcategorieService.create(evc);
	}
}
