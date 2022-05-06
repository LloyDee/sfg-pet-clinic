package guru.springwork.sfgpetclinic.services;

import guru.springwork.sfgpetclinic.model.Owner;

/**
 * @Project sfg-pet-clinic
 * @Created by loyd_ on 4/29/2022
 **/
public interface OnwerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
