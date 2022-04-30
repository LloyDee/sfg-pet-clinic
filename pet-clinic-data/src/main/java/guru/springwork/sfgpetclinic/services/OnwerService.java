package guru.springwork.sfgpetclinic.services;

import guru.springwork.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @Project sfg-pet-clinic
 * @Created by loyd_ on 4/29/2022
 **/
public interface OnwerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
