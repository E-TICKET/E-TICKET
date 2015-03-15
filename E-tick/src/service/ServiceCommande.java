package service;

import dao.IDAOObject;
import model.Client;
import model.Commande;




public class ServiceCommande implements IServiceObject<Commande>{
IDAOObject commandeDao;

public void setCommandeDao(IDAOObject commandeDao) {
	this.commandeDao = commandeDao;
}

@Override
public void create(Commande person) {
	// TODO Auto-generated method stub
	commandeDao.save(person);
}

@Override
public void delete(Commande person) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(Commande person) {
	// TODO Auto-generated method stub
	
}

@Override
public Commande searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Commande) commandeDao.findById(id);
}

	
	

}
