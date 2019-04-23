package com.itstep.spring.l03_mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AssignmentController {
    @Autowired
    PersonRepository persons;

    @Autowired
    RoleRepository roles;

    @Autowired
    GenresConfig genres;

    @PostMapping(value = "/persons/{person_id}/roles/{role_id}")
    public Person assignRole(@PathVariable("person_id") String personId, @PathVariable("role_id") String roleId) {
        Optional<Person> _person = persons.findById(personId);
        Optional<Role> _role = roles.findById(roleId);
        List<Role> list = genres.getGenres();
        list.forEach(System.out::println);
        if (_person.isPresent() && _role.isPresent()) {
            Person person = _person.get();
            person.setRole(_role.get());
            persons.save(person);
            return person;
        } else {
            throw new IllegalArgumentException("Not Found");
        }
    }

}
