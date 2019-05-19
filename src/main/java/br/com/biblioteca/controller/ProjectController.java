package br.com.biblioteca.controller;

import br.com.biblioteca.model.Person;
import br.com.biblioteca.model.Project;
import br.com.biblioteca.model.ProjectStatusEnum;
import br.com.biblioteca.repository.PersonRepository;
import br.com.biblioteca.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/project", method = RequestMethod.POST)
    public String createProject(@Valid @RequestBody Project project) {
         projectRepository.save(project);

        return "redirect:/projects";
    }

    @RequestMapping(value ="/", method=RequestMethod.GET)
    public String lista(Model model){
        model.addAttribute("projects", projectRepository.findAll());
        return "/project/lista";
    }

    @RequestMapping(value ="/novo", method=RequestMethod.GET)
    public String novo(Model model){
        return "/projects/form";
    }

    @ModelAttribute("allManager")
    public List<Person> getManagerList()
    {
        List<Person> list = personRepository.findAll();

        list =  list.parallelStream().filter(p -> p.isFuncionario()).collect(Collectors.toList());

        return list;
    }


    @ModelAttribute("allProjectStatus")
    public List<ProjectStatusEnum> getStatusList()
    {
        ProjectStatusEnum e;
        e.
        return Arrays.asList(ProjectStatusEnum.values());

    }

}
