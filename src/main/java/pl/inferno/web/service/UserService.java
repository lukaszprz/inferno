/**
 *
 */
package pl.inferno.web.service;

import java.util.List;

import pl.inferno.web.exception.UserAlreadyExistsException;
import pl.inferno.web.model.User;

/**
 * @author lukasz
 *
 */
public interface UserService {

	User save(User user) throws UserAlreadyExistsException;

	List<User> listAllUsers();

	User getUser(Long id);

	User findUserByLogin(String login);

}
