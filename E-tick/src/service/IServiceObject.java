package service;




public interface IServiceObject<T> {
void create(T person);
void delete(T person);
void update(T person);
T searchPersonById(int id);
}
