/**
 *
 */
package pl.inferno.web.service.impl;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import pl.inferno.web.exception.PersonAlreadyExistsException;
import pl.inferno.web.model.Person;
import pl.inferno.web.repository.PersonRepository;
import pl.inferno.web.service.PersonService;

/**
 * @author lukasz
 *
 */
@Service
@Validated
public class PersonServiceImpl implements PersonService {

	private static final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

	@Autowired
	private PersonRepository personRepository;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * pl.inferno.web.service.PersonService#save(pl.inferno.web.model.Person)
	 */
	@Override
	@Transactional
	public Person save(@NotNull @Valid final Person person) throws PersonAlreadyExistsException {
		logger.debug("[Person] create", person);
		Person existing = personRepository.findOne(person.getId());
		if (existing != null) {
			throw new PersonAlreadyExistsException(
			        String.format("There already exists a person with id=%s", person.getId()));
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see pl.inferno.web.service.PersonService#getAllPersons()
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Person> getAllPersons() {
		logger.debug("[Person] Retrieving the list of all persons...");
		return personRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see pl.inferno.web.service.PersonService#getPerson(java.lang.Long)
	 */
	@Override
	@Transactional(readOnly = true)
	public Person getPerson(@NotNull Long id) {
		logger.debug("[Person] get single user by id...", id);
		return personRepository.getOne(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see pl.inferno.web.service.PersonService#getPersonsByLastName(java.lang.
	 * String)
	 */
	@Override
	public List<Person> getPersonsByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * pl.inferno.web.service.PersonService#getPersonsByFirstAndLastName(java.
	 * lang.String, java.lang.String)
	 */
	@Override
	public List<Person> getPersonsByFirstAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
