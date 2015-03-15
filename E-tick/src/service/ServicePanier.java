package service;

import dao.IDAOObject;

import model.Panier;




public class ServicePanier implements IServiceObject<Panier>{
IDAOObject PanierDao;

public IDAOObject getPanierDao() {
	return PanierDao;
}



public void setPanierDao(IDAOObject panierDao) {
	PanierDao = panierDao;
}



@Override
public void create(Panier person) {
	// TODO Auto-generated method stub
	PanierDao.save(person);
}



@Override
public void delete(Panier person) {
	// TODO Auto-generated method stub
	PanierDao.delete(person);
}

@Override
public void update(Panier person) {
	// TODO Auto-generated method stub
	
}

@Override
public Panier searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Panier) PanierDao.findById(id);
}
	

}
