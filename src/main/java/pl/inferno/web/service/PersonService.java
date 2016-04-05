/**
 *
 */
package pl.inferno.web.service;

import java.util.List;

import pl.inferno.web.exception.PersonAlreadyExistsException;
import pl.inferno.web.model.Person;

/**
 * @author lukasz
 *
 */
public interface PersonService {

	Person save(Person person) throws PersonAlreadyExistsException;

	List<Person> getAllPersons();

	Person getPerson(Long id);

	List<Person> getPersonsByLastName(String lastName);

	List<Person> getPersonsByFirstAndLastName(String firstName, String lastName);

}
