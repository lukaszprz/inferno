/**
 *
 */
package pl.inferno.web.mapper;

import pl.inferno.web.model.Address;
import pl.inferno.web.model.Person;
import pl.inferno.web.model.form.PersonForm;

/**
 * @author lukasz
 *
 */
public class PersonMapper {

	public static Person mapFormToPerson(PersonForm form) {
		Person person = new Person();
		person.setFirstName(form.getFirstName());
		person.setLastName(form.getLastName());
		Address address = new Address();
		address.setStreet(form.getStreet());
		address.setBuildingNumber(form.getBuildingNumber());
		address.setFlatNumber(form.getFlatNumber());
		address.setPostCode(form.getPostCode());
		address.setCity(form.getCity());
		address.setDistrict(form.getDistrict());
		person.setAddress(address);
		person.setCorrespondenceAddress(address);
		return person;
	}

}
