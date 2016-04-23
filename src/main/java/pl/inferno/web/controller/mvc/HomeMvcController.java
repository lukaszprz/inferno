/**
 * File HomeMvcController.java created on 19 kwi 2016 19:44:10 by Łukasz Przesmycki (lukasz)
 */
package pl.inferno.web.controller.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.inferno.web.controller.AbstractController;

/**
 * <p>
 * inferno-web
 * </p>
 * <p>
 * HomeMvcController
 * </p>
 *
 * @author lukasz
 *
 */
@Controller
public class HomeMvcController extends AbstractController {

	/**
	 * Field logger of type HomeMvcController
	 */
	private static final Logger logger = LoggerFactory.getLogger(HomeMvcController.class);

	/**
	 * Method index of type HomeMvcController that returns ModelAndView
	 *
	 * @return
	 */
	@RequestMapping(value = "/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
