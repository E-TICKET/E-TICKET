package model;



import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IServiceObject;




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
		Categorie c2 = new Categorie();
		c.setNbCategorie(1);
		c.setNomCategorie("A");
		categorieService.create(c2);
		 
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
		
		evc.setEvenementB(e);
		evc.setCategorieA(c);
		evenementcategorieService.create(evc);
		evc.setCategorieA(c2);
		evc.setEvenementB(e);
		evenementcategorieService.create(evc);
		
		IServiceObject ClientService=(IServiceObject)context.getBean("clientService");
		Client Cl = new Client();
		Cl.setNomClient("Client");
		ClientService.create(Cl);



		IServiceObject DateService=(IServiceObject)context.getBean("dateService");
		Date_Ev D= new Date_Ev();
		
		Date datedebut= new Date(2005,01,15);
		
		D.setDateDebut(datedebut);

		DateService.create(D);

		
		IServiceObject CommandeService=(IServiceObject)context.getBean("commandeService");
		Commande Co = new Commande();
		Co.setDateCommande(datedebut);
		CommandeService.create(Co);

		IServiceObject PanierService=(IServiceObject)context.getBean("panierService");
		Panier Pa = new Panier();
		PanierService.create(Pa);
		
		IServiceObject LigneCommandeService=(IServiceObject)context.getBean("ligneCommandeService");
		LigneCommande LC = new LigneCommande();
		LigneCommandeService.create(LC);
		
		IServiceObject SeanceService=(IServiceObject)context.getBean("seanceService");
		Seance S = new Seance();
		SeanceService.create(S);
		
		IServiceObject FactureService=(IServiceObject)context.getBean("factureService");
		Facture F = new Facture();
		FactureService.create(F);
		
		IServiceObject TypeEvenementService=(IServiceObject)context.getBean("typeEvenementService");
		TypeEvenement TE = new TypeEvenement();
		TypeEvenementService.create(TE);
		
IServiceObject Lieu =(IServiceObject)context.getBean("lieuService");
		Lieu Li = new Lieu();
		
				Lieu.create(Li);
				
				
				
				IServiceObject GenreEvenement =(IServiceObject)context.getBean("genreEvenement");
                    GenreEvenement ge = new GenreEvenement();
						
                    GenreEvenement.create(ge);
				
		
	}


}
