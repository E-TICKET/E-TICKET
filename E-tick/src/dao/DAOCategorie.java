package dao;

import model.Categorie;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOCategorie extends HibernateDaoSupport implements IDAOObject<Categorie>{
	@Override
	public void save(Categorie c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	@Override
	public void delete(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categorie findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	   
}
