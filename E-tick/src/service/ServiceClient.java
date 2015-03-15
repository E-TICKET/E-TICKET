package service;

import dao.IDAOObject;
import model.Categorie;
import model.Client;




public class ServiceClient implements IServiceObject<Client>{
IDAOObject ClientDao;

@Override
public void create(Client person) {
	// TODO Auto-generated method stub
	ClientDao.save(person);
}

public void setClientDao(IDAOObject clientDao) {
	ClientDao = clientDao;
}

@Override
public void delete(Client person) {
	// TODO Auto-generated method stub
	ClientDao.delete(person);
}

@Override
public void update(Client person) {
	// TODO Auto-generated method stub
	
}

@Override
public Client searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Client) ClientDao.findById(id);
}
	

}
