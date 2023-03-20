package vn.edu.vnu.java.prac03less23;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @GetMapping("/{id}")
    public HttpEntity<Person> getPerson(@PathVariable("id") String id) {
        Person person = new Person("John", "Doe");
        Link selfLink = linkTo(methodOn(PersonController.class).getPerson(id)).withSelfRel();
        Link allPersonsLink = linkTo(methodOn(PersonController.class).getAllPersons()).withRel("all-persons");

        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @GetMapping
    public CollectionModel<Person> getAllPersons() {
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Doe");
//        Link selfLink = linkTo(methodOn(PersonController.class).getAllPersons()).withSelfRel();

        person1.add(linkTo(methodOn(PersonController.class).getPerson("1")).withSelfRel());
        person2.add(linkTo(methodOn(PersonController.class).getPerson("2")).withSelfRel());
        persons.add(person1);
        persons.add(person2);

        CollectionModel<Person> collectionModel = CollectionModel.of(persons);
        collectionModel.add(linkTo(methodOn(PersonController.class).getAllPersons()).withSelfRel());
        return collectionModel;
    }
}


