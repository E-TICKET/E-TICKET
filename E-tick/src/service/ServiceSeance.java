package service;

import dao.IDAOObject;
import model.Seance;




public class ServiceSeance implements IServiceObject<Seance>{
IDAOObject seanceDao;

	public void setSeanceDao(IDAOObject seanceDao) {
	this.seanceDao = seanceDao;
}





	@Override
	
	public void create(Seance c) {
		seanceDao.save(c);
		
	}

	



	@Override
	public void delete(Seance c) {
		seanceDao.delete(c);
		
	}

	@Override
	public void update(Seance c) {
		//hdhd
		
	}

	@Override
	public Seance searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (Seance) seanceDao.findById(id);
	}

}
