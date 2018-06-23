package sr.unasat.ad.entities;

public class Person {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFullname() {
        return lastname + " " + firstname;
    }

    @Override
    public String toString() {
        return getFullname();
    }
}
