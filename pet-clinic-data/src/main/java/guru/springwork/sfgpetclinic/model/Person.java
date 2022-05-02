package guru.springwork.sfgpetclinic.model;

/**
 * @Project sfg-pet-clinic
 * @Author loyd_ on 4/29/2022
 **/

public class Person extends BaseEntity{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
