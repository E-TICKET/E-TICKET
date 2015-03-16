package service;

import dao.IDAOObject;

import model.Facture;




public class ServiceFacture implements IServiceObject<Facture>{
IDAOObject FactureDao;

public void setFactureDao(IDAOObject factureDao) {
	FactureDao = factureDao;
}



@Override
public void create(Facture person) {
	// TODO Auto-generated method stub
	FactureDao.save(person);
}



@Override
public void delete(Facture person) {
	// TODO Auto-generated method stub
	FactureDao.delete(person);
}

@Override
public void update(Facture person) {
	// TODO Auto-generated method stub
	
}

@Override
public Facture searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Facture) FactureDao.findById(id);
}
	

}
