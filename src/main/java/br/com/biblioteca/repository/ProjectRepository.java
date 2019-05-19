package br.com.biblioteca.repository;

import br.com.biblioteca.model.Person;
import br.com.biblioteca.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Elton H. Paula
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
