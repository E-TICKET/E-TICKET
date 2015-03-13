package categorie;

import service.IDAOObject;
import service.IServiceObject;




public class ServiceCategorie implements IServiceObject<Categorie>{
IDAOObject categorieDao;
	@Override
	
	public void create(Categorie person) {
		categorieDao.savePersonne(person);
		
	}

	
	public void setCategorieDao(IDAOObject categorieDao) {
		this.categorieDao = categorieDao;
	}


	@Override
	public void delete(Categorie person) {
		categorieDao.deletePersonne(person);
		
	}

	@Override
	public void update(Categorie person) {
		//hdhd
		
	}

	@Override
	public Categorie searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (Categorie) categorieDao.findById(id);
	}

}
