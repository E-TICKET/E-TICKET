package evenementcategorie;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import service.IDAOObject;

public class DAOEvenementCategorie extends HibernateDaoSupport implements IDAOObject<EvenementCategorie>{

	@Override
	public void savePersonne(EvenementCategorie personne) {
		getHibernateTemplate().save(personne);
		
	}

	@Override
	public void deletePersonne(EvenementCategorie personne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EvenementCategorie findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	   
}
