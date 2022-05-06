package guru.springwork.sfgpetclinic.services.map;

import guru.springwork.sfgpetclinic.model.Owner;
import guru.springwork.sfgpetclinic.model.Vet;
import guru.springwork.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 5/5/2022
 **/
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
