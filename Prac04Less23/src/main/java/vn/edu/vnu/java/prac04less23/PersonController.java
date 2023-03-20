package vn.edu.vnu.java.prac04less23;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") Long id) {
        // Perform a lookup to find the person with the specified ID
        Person person = new Person(1,"John", "Doe");

        // If the person is not found, throw a ResourceNotFoundException
        if (person == null) {
            throw new ResourceNotFoundException("Person with ID " + id + " not found");
        }

        return person;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleResourceNotFoundException(ResourceNotFoundException ex) {
        return ex.getMessage();
    }
}

