package guru.springwork.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 5/2/2022
 **/
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
