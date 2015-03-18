package service;

import dao.IDAOObject;
import model.TypeEvenement;




public class ServiceTypeEvenement implements IServiceObject<TypeEvenement>{
IDAOObject typeEvenementDao;
	@Override
	
	public void create(TypeEvenement c) {
		typeEvenementDao.save(c);
		
	}

	

	public void setTypeEvenementDao(IDAOObject typeEvenementDao) {
		this.typeEvenementDao = typeEvenementDao;
	}



	@Override
	public void delete(TypeEvenement c) {
		typeEvenementDao.delete(c);
		
	}

	@Override
	public void update(TypeEvenement c) {
	
		
	}

	@Override
	public TypeEvenement searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (TypeEvenement) typeEvenementDao.findById(id);
	}

}
