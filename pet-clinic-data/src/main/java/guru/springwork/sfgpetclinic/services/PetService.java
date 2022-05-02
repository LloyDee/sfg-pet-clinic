package guru.springwork.sfgpetclinic.services;

import guru.springwork.sfgpetclinic.model.Owner;
import guru.springwork.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @Project sfg-pet-clinic
 * @Created by loyd_ on 4/29/2022
 **/
public interface PetService {
    Pet findByName(String name);
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
