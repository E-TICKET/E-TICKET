package service;


public interface IDAOObject<T> {
		public void savePersonne(T personne);
		public void deletePersonne(T personne);
		public T findById(int id);
}
