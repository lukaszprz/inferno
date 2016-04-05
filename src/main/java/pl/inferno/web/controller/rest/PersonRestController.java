/**
 *
 */
package pl.inferno.web.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pl.inferno.web.controller.AbstractController;
import pl.inferno.web.exception.PersonAlreadyExistsException;
import pl.inferno.web.model.Person;
import pl.inferno.web.service.PersonService;

/**
 * @author lukasz
 *
 */
@RestController
@RequestMapping("/rest/person")
public class PersonRestController extends AbstractController {

	private static final Logger logger = LoggerFactory.getLogger(PersonRestController.class);

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<Person> createPerson(@RequestBody Person person) {
		logger.debug(REST + "Received request to create the {}", person);
		Person result;
		ResponseEntity<Person> response;
		try {
			result = personService.save(person);
			response = new ResponseEntity<Person>(result, HttpStatus.CREATED);
		} catch (PersonAlreadyExistsException e) {
			logger.error(REST + "Person already exists!", e);
			response = new ResponseEntity<Person>(HttpStatus.CONFLICT);
		}

		return response;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.CONFLICT)
	public String handlePersonAlreadyExistsException(PersonAlreadyExistsException e) {
		return e.getLocalizedMessage();
	}
}
