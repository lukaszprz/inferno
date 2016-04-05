/**
 *
 */
package pl.inferno.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.inferno.web.model.Address;

/**
 * @author lukasz
 *
 */
public interface AddressRepository extends JpaRepository<Address, Long> {

}
