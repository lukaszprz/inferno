/**
 *
 */
package pl.inferno.web.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import pl.inferno.web.exception.UserAlreadyExistsException;
import pl.inferno.web.model.User;
import pl.inferno.web.repository.UserRepository;
import pl.inferno.web.service.UserService;

/**
 * @author lukasz
 *
 */
@Service
@Validated
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see pl.inferno.web.service.UserService#save(pl.inferno.web.model.User)
	 */
	@Override
	public User save(User user) throws UserAlreadyExistsException {
		logger.debug("[User] create", user);
		User existing = userRepository.findByLogin(user.getLogin());
		if (existing != null) {
			throw new UserAlreadyExistsException(
			        String.format("There already exists an user with id=%s", user.getLogin()));
		}
		return userRepository.save(user);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see pl.inferno.web.service.UserService#listAllUsers()
	 */
	@Override
	public List<User> listAllUsers() {
		return userRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see pl.inferno.web.service.UserService#getUser(java.lang.Long)
	 */
	@Override
	public User getUser(Long id) {
		return userRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see pl.inferno.web.service.UserService#findUserByLogin(java.lang.String)
	 */
	@Override
	public User findUserByLogin(String login) {
		return userRepository.findByLogin(login);
	}

}
