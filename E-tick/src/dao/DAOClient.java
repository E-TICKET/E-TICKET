package dao;

import model.Client;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOClient extends HibernateDaoSupport implements IDAOObject<Client>{

	@Override
	public void save(Client x) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(x);
	}

	@Override
	public void delete(Client y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
