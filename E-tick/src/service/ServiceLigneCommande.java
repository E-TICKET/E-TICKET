package service;

import dao.IDAOObject;
import model.LigneCommande;
import model.Panier;




public class ServiceLigneCommande implements IServiceObject<LigneCommande>{
IDAOObject ligneCommandeDao;



public void setLigneCommandeDao(IDAOObject ligneCommandeDao) {
	this.ligneCommandeDao = ligneCommandeDao;
}


public IDAOObject getPanierDao() {
	return ligneCommandeDao;
}


@Override
public void create(LigneCommande person) {
	// TODO Auto-generated method stub
	ligneCommandeDao.save(person);
}



@Override
public void delete(LigneCommande person) {
	// TODO Auto-generated method stub
	ligneCommandeDao.delete(person);
}

@Override
public void update(LigneCommande person) {
	// TODO Auto-generated method stub
	
}

@Override
public LigneCommande searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (LigneCommande) ligneCommandeDao.findById(id);
}
	

}
