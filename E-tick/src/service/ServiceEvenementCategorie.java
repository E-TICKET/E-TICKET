package service;

import model.EvenementCategorie;
import dao.IDAOObject;




public class ServiceEvenementCategorie implements IServiceObject<EvenementCategorie>{
IDAOObject evenementcategorieDao;

public void setEvenementcategorieDao(IDAOObject evenementcategorieDao) {
	this.evenementcategorieDao = evenementcategorieDao;
}

@Override
public void create(EvenementCategorie evc) {
	evenementcategorieDao.save(evc);
	
}

@Override
public void delete(EvenementCategorie evc) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(EvenementCategorie evc) {
	// TODO Auto-generated method stub
	
}

@Override
public EvenementCategorie searchPersonById(int id) {
	// TODO Auto-generated method stub
	return null;
}
	
	
	

	
	


	





	
}
