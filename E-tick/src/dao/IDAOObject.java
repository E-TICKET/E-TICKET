package dao;


public interface IDAOObject<T> {
		public void save(T x);
		public void delete(T y);
		public T findById(int id);
}
