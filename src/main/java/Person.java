import java.time.LocalDate;
import java.util.Date;

public class Person {

    private Long id;
    private String lastName;
    private String firstName;
    private LocalDate birthdate;
    private int postcode;
    private String city;

    public Person(Long id, String lastName, String firstName, LocalDate birthdate, int postcode, String city) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.postcode = postcode;
        this.city = city;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {


        return this.firstName + " " + this.lastName + " was born on " + this.birthdate +  " and lives in " + this.postcode + " " + this.city;

    }
}
