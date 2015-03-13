package categorie;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import service.IDAOObject;

public class DAOCategorie extends HibernateDaoSupport implements IDAOObject<Categorie>{
	@Override
	public void savePersonne(Categorie personne) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(personne);
	}

	@Override
	public void deletePersonne(Categorie personne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categorie findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	   
}
