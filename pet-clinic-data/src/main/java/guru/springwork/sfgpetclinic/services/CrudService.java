package guru.springwork.sfgpetclinic.services;

import java.util.Set;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 5/5/2022
 **/
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);
    T save(T object);

    void delete(T object);
    void deleteById(ID id);
}
