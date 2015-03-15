package dao;

import model.Seance;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOSeance extends HibernateDaoSupport implements IDAOObject<Seance>{

	@Override
	public void save(Seance x) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(x);
	}

	@Override
	public void delete(Seance y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seance findById(int id) {
		// TODO Auto-generated method stub
		return null ;
	}
	
}
