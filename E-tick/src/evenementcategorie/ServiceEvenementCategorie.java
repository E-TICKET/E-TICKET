package evenementcategorie;

import service.IDAOObject;
import service.IServiceObject;




public class ServiceEvenementCategorie implements IServiceObject<EvenementCategorie>{
IDAOObject evenementcategorieDao;

public void setEvenementcategorieDao(IDAOObject evenementcategorieDao) {
	this.evenementcategorieDao = evenementcategorieDao;
}

@Override
public void create(EvenementCategorie person) {
	evenementcategorieDao.savePersonne(person);
	
}

@Override
public void delete(EvenementCategorie person) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(EvenementCategorie person) {
	// TODO Auto-generated method stub
	
}

@Override
public EvenementCategorie searchPersonById(int id) {
	// TODO Auto-generated method stub
	return null;
}
	
	
	

	
	


	





	
}
