package service;

import dao.IDAOObject;

import model.Panier;




public class ServicePanier implements IServiceObject<Panier>{
IDAOObject panierDao;

public IDAOObject getPanierDao() {
	return panierDao;
}







public void setPanierDao(IDAOObject panierDao) {
	this.panierDao = panierDao;
}







@Override
public void create(Panier person) {
	// TODO Auto-generated method stub
	panierDao.save(person);
}



@Override
public void delete(Panier person) {
	// TODO Auto-generated method stub
	panierDao.delete(person);
}

@Override
public void update(Panier person) {
	// TODO Auto-generated method stub
	
}

@Override
public Panier searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Panier) panierDao.findById(id);
}
	

}
