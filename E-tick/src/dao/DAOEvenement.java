package dao;

import model.Evenement;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOEvenement extends HibernateDaoSupport implements IDAOObject<Evenement>{
	@Override
	public void save(Evenement ev) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(ev);
	}

	@Override
	public void delete(Evenement ev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Evenement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	   
}
