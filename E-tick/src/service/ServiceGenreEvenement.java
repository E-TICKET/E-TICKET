package service;

import dao.IDAOObject;
import model.GenreEvenement;

public class ServiceGenreEvenement implements IServiceObject<GenreEvenement>{
	IDAOObject daogenreevenement;
	@Override
	public void create(GenreEvenement ge) {
		// TODO Auto-generated method stub
		daogenreevenement.save(ge);
	}

	@Override
	public void delete(GenreEvenement ge) {
		// TODO Auto-generated method stub
		daogenreevenement.delete(ge);
	}

	@Override
	public void update(GenreEvenement person) {
		// TODO Auto-generated method stub
		
	}
	

	public IDAOObject getDaogenreevenement() {
		return daogenreevenement;
	}

	public void setDaogenreevenement(IDAOObject daogenreevenement) {
		this.daogenreevenement = daogenreevenement;
	}

	@Override
	public GenreEvenement searchPersonById(int id) {
		// TODO Auto-generated method stub
		return (GenreEvenement) daogenreevenement.findById(id);
	}

}
