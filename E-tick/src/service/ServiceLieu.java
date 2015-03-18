package service;

import dao.IDAOObject;

import model.Lieu;

public class ServiceLieu implements IServiceObject<Lieu>{

	IDAOObject lieuDao;
	@Override
	public void create(Lieu l) {
		// TODO Auto-generated method stub
		lieuDao.save(l);
	}

	@Override
	public void delete(Lieu l ) {
		// TODO Auto-generated method stub
		lieuDao.delete(l);
	}



	public IDAOObject getLieuDao() {
		return lieuDao;
	}



	public void setLieuDao(IDAOObject lieuDao) {
		this.lieuDao = lieuDao;
	}

	@Override
	public void update(Lieu person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lieu searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (Lieu) lieuDao.findById(id);
	}

}
