package JAVACOREDAY14.model.service;

public interface IGeneralService<T, L> {
    void changeName(T obj, L objs);
    void changPhone(T obj, L objs);
    void changeAddress(T obj, L objs);
}
