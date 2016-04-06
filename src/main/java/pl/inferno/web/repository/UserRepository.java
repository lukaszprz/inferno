/**
 *
 */
package pl.inferno.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.inferno.web.model.User;

/**
 * @author lukasz
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByLogin(String login);

}
