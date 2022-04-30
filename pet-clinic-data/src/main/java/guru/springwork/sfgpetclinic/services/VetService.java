package guru.springwork.sfgpetclinic.services;

import guru.springwork.sfgpetclinic.model.Pet;
import guru.springwork.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @Project sfg-pet-clinic
 * @Created by loyd_ on 4/29/2022
 **/
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
