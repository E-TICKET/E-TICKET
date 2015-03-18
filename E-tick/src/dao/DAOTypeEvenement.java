package dao;

import model.TypeEvenement;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOTypeEvenement extends HibernateDaoSupport implements IDAOObject<TypeEvenement>{
	@Override
	public void save(TypeEvenement c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	@Override
	public void delete(TypeEvenement c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TypeEvenement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	   
}
