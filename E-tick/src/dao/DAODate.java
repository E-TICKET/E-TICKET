package dao;

import model.Date_Ev;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAODate extends HibernateDaoSupport implements IDAOObject<Date_Ev>{

	@Override
	public void save(Date_Ev x) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(x);
	}

	@Override
	public void delete(Date_Ev y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date_Ev findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
