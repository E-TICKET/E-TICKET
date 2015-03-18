package dao;


import model.Lieu;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DAOLieu extends HibernateDaoSupport implements IDAOObject<Lieu> {

	@Override
	public void save(Lieu l) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(l);
	}

	@Override
	public void delete(Lieu l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lieu findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
