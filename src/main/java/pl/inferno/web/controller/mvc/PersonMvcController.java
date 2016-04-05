/**
 *
 */
package pl.inferno.web.controller.mvc;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.inferno.web.controller.AbstractController;
import pl.inferno.web.exception.PersonAlreadyExistsException;
import pl.inferno.web.mapper.PersonMapper;
import pl.inferno.web.model.Person;
import pl.inferno.web.model.form.PersonForm;
import pl.inferno.web.service.PersonService;

/**
 * @author lukasz
 *
 */
@Controller
public class PersonMvcController extends AbstractController {

	private static final Logger logger = LoggerFactory.getLogger(PersonMvcController.class);

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/person_create.html", method = RequestMethod.GET)
	public ModelAndView getCreatePersonView() {
		logger.debug(MVC + "Received request for person create view");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("create_person");
		modelAndView.addObject("form", new PersonForm());
		return modelAndView;
	}

	public String submitPerson(@ModelAttribute("form") @Valid PersonForm form, BindingResult result) {
		logger.debug(MVC + "Received request to create {}, with result={}", form, result);
		if (result.hasErrors()) {
			return "person_create";
		}
		Person person = PersonMapper.mapFormToPerson(form);
		try {
			personService.save(person);
		} catch (PersonAlreadyExistsException e) {
			logger.error(MVC + "Person already exists!", e);
			result.reject("person.error.exists");
			return "person_create";
		}
		return "redirect:/person_list.html";
	}

	@RequestMapping("/person_list.html")
	public ModelAndView getPersonListView() {
		logger.debug(MVC + "Received request to get persons list view");
		ModelMap model = new ModelMap();
		model.addAttribute("persons", personService.getAllPersons());
		return new ModelAndView("person_list", model);
	}
}
