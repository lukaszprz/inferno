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
import pl.inferno.web.exception.UserAlreadyExistsException;
import pl.inferno.web.model.User;
import pl.inferno.web.model.form.UserForm;
import pl.inferno.web.service.UserService;

/**
 * @author lukasz
 *
 */
@Controller
public class UserMvcController extends AbstractController {

	private static final Logger logger = LoggerFactory.getLogger(UserMvcController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user_create.html", method = RequestMethod.GET)
	public ModelAndView getUserCreateView() {
		logger.debug(MVC + "Received request for user create view");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user_create");
		modelAndView.addObject("form", new UserForm());
		return modelAndView;
	}

	@RequestMapping(value = "/user_create.html", method = RequestMethod.POST)
	public String submitUser(@ModelAttribute("form") @Valid UserForm form, BindingResult result) {
		logger.debug(MVC + "Received request to create {}, with result={}", form, result);
		if (result.hasErrors()) {
			return "user_create";
		}

		User user = new User();
		user.setLogin(form.getUsername());
		user.setPassword(form.getPassword());

		try {
			userService.save(user);
		} catch (UserAlreadyExistsException e) {
			logger.error(MVC + "User already exists!", e);
			result.reject("user.error.exists");
			return "user_create";
		}
		return "redirect:/user_list.html";
	}

	@RequestMapping("/user_list.html")
	public ModelAndView getUserListView() {
		logger.debug(MVC + "Received request to get users list view");
		ModelMap model = new ModelMap();
		model.addAttribute("users", userService.listAllUsers());
		return new ModelAndView("user_list", model);
	}
}
