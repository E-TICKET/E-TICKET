package evenement;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import service.IDAOObject;

public class DAOEvenement extends HibernateDaoSupport implements IDAOObject<Evenement>{
	@Override
	public void savePersonne(Evenement personne) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(personne);
	}

	@Override
	public void deletePersonne(Evenement personne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Evenement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	   
}
