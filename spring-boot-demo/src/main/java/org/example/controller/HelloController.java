package org.example.controller;

import org.example.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("get")
    public Person get(String id){
        Person person = new Person();
        person.setId(id);
        return person;
    }
}
