package dao;


import model.LigneCommande;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DAOLigneCommande extends HibernateDaoSupport implements IDAOObject<LigneCommande>{
	@Override
	public void save(LigneCommande c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	@Override
	public void delete(LigneCommande c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LigneCommande findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	   
}
