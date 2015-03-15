package service;

import dao.IDAOObject;
import model.Categorie;




public class ServiceCategorie implements IServiceObject<Categorie>{
IDAOObject categorieDao;
	@Override
	
	public void create(Categorie c) {
		categorieDao.save(c);
		
	}

	
	public void setCategorieDao(IDAOObject categorieDao) {
		this.categorieDao = categorieDao;
	}


	@Override
	public void delete(Categorie c) {
		categorieDao.delete(c);
		
	}

	@Override
	public void update(Categorie c) {
		//hdhd
		
	}

	@Override
	public Categorie searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (Categorie) categorieDao.findById(id);
	}

}
