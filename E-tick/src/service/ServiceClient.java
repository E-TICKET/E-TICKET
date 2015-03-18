package service;

import dao.IDAOObject;
import model.Categorie;
import model.Client;




public class ServiceClient implements IServiceObject<Client>{
IDAOObject clientDao;





public void setClientDao(IDAOObject clientDao) {
	this.clientDao = clientDao;
}



@Override
public void create(Client person) {
	// TODO Auto-generated method stub
	clientDao.save(person);
}



@Override
public void delete(Client person) {
	// TODO Auto-generated method stub
	clientDao.delete(person);
}

@Override
public void update(Client person) {
	// TODO Auto-generated method stub
	
}

@Override
public Client searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Client) clientDao.findById(id);
}
	

}
