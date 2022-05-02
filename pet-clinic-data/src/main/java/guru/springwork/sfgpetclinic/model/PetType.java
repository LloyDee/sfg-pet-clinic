package guru.springwork.sfgpetclinic.model;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 4/29/2022
 **/
public class PetType extends BaseEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
