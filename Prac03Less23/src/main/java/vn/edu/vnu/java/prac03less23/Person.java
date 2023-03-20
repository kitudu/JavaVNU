package vn.edu.vnu.java.prac03less23;

import org.springframework.hateoas.RepresentationModel;

public class Person extends RepresentationModel<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters and setters omitted for brevity
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
}
