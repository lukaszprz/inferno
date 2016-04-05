/**
 *
 */
package pl.inferno.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.inferno.web.model.Person;

/**
 * @author lukasz
 *
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
