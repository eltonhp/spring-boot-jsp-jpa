package br.com.biblioteca.controller;

import br.com.biblioteca.model.Person;

import br.com.biblioteca.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class PersonController {

    @Autowired
     private PersonRepository personRepository;


    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String createProject(@Valid @RequestBody Person person) {
          personRepository.save(person);

         return "redirect:/persons";
    }

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public String listPersons(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("persons", personRepository.findAll());
        return "person";
    }
}
