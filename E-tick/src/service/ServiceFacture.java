package service;

import dao.IDAOObject;

import model.Facture;




public class ServiceFacture implements IServiceObject<Facture>{
IDAOObject factureDao;





public void setFactureDao(IDAOObject factureDao) {
	this.factureDao = factureDao;
}



@Override
public void create(Facture person) {
	// TODO Auto-generated method stub
	factureDao.save(person);
}



@Override
public void delete(Facture person) {
	// TODO Auto-generated method stub
	factureDao.delete(person);
}

@Override
public void update(Facture person) {
	// TODO Auto-generated method stub
	
}

@Override
public Facture searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Facture) factureDao.findById(id);
}
	

}
