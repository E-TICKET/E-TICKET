package dao;

import model.Date_E;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAODate extends HibernateDaoSupport implements IDAOObject<Date_E>{

	@Override
	public void save(Date_E x) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(x);
	}

	@Override
	public void delete(Date_E y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date_E findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
