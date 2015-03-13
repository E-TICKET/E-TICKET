package evenement;

import service.IDAOObject;
import service.IServiceObject;




public class ServiceEvenement implements IServiceObject<Evenement>{
IDAOObject evenementDao;
	@Override
	
	public void create(Evenement person) {
		evenementDao.savePersonne(person);
		
	}

	
	


	public void setEvenementDao(IDAOObject evenementDao) {
		this.evenementDao = evenementDao;
	}





	@Override
	public void delete(Evenement person) {
		evenementDao.deletePersonne(person);
		
	}

	@Override
	public void update(Evenement person) {
		//hdhd
		
	}

	@Override
	public Evenement searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (Evenement) evenementDao.findById(id);
	}

}
