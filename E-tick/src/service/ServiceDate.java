package service;

import dao.IDAOObject;

import model.Date_E;




public class ServiceDate implements IServiceObject<Date_E>{
IDAOObject dateDao;



public void setDateDao(IDAOObject dateDao) {
	this.dateDao = dateDao;
}

@Override
public void create(Date_E person) {
	// TODO Auto-generated method stub
	dateDao.save(person);
}

@Override
public void delete(Date_E person) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(Date_E person) {
	// TODO Auto-generated method stub
	
}

@Override
public Date_E searchPersonById(int id) {
	// TODO Auto-generated method stub
	return (Date_E) dateDao.findById(id);
}

	
	

}
