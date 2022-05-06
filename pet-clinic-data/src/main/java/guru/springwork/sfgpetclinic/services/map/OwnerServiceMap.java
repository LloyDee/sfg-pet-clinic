package guru.springwork.sfgpetclinic.services.map;

import guru.springwork.sfgpetclinic.model.Owner;
import guru.springwork.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 5/5/2022
 **/
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
