package br.com.biblioteca.repository;

import br.com.biblioteca.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Elton H. Paula
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
