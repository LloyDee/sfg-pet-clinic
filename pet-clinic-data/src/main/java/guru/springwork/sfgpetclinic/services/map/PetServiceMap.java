package guru.springwork.sfgpetclinic.services.map;

import guru.springwork.sfgpetclinic.model.Pet;
import guru.springwork.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 5/5/2022
 **/
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
