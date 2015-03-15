package service;

import dao.IDAOObject;
import model.LigneCommande;
import model.Panier;




public class ServiceLigneCommande implements IServiceObject<LigneCommande>{
IDAOObject LigneCommandeDao;

public void setLigneCommandeDao(IDAOObject ligneCommandeDao) {
	LigneCommandeDao = ligneCommandeDao;
}


public IDAOObject getPanierDao() {
	return LigneCommandeDao;
}


@Override
public void create(LigneCommande person) {
	// TODO Auto-generated method stub
	LigneCommandeDao.save(person);
}



@Override
public void delete(LigneCommande person) {
	// TODO Auto-generated method stub
	LigneCommandeDao.delete(person);
}

@Override
public void update(LigneCommande person) {
	// TODO Auto-generated method stub
	
}

@Override
public LigneCommande searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (LigneCommande) LigneCommandeDao.findById(id);
}
	

}
