/**
 *
 */
package pl.inferno.web.mapper;

import pl.inferno.web.model.Address;
import pl.inferno.web.model.Person;
import pl.inferno.web.model.form.AddressForm;
import pl.inferno.web.model.form.PersonForm;

/**
 * @author lukasz
 *
 */
public class PersonMapper {

	public static Person mapFormToPerson(PersonForm form) {
		Person person = new Person();
		Address address = new Address();
		Address correspondenceAddress = new Address();

		AddressForm addressForm = form.getAddress();
		AddressForm correspondenceAddressForm = form.getCorrespondenceAddress();

		person.setFirstName(form.getFirstName());
		person.setLastName(form.getLastName());

		address.setStreet(addressForm.getStreet());
		address.setBuildingNumber(addressForm.getBuildingNumber());
		address.setFlatNumber(addressForm.getFlatNumber());
		address.setPostCode(addressForm.getPostCode());
		address.setCity(addressForm.getCity());
		address.setDistrict(addressForm.getDistrict());
		person.setAddress(address);

		correspondenceAddress.setStreet(correspondenceAddressForm.getStreet());
		correspondenceAddress.setBuildingNumber(correspondenceAddressForm.getBuildingNumber());
		correspondenceAddress.setFlatNumber(correspondenceAddressForm.getFlatNumber());
		correspondenceAddress.setPostCode(correspondenceAddressForm.getPostCode());
		correspondenceAddress.setCity(correspondenceAddressForm.getCity());
		correspondenceAddress.setDistrict(correspondenceAddressForm.getDistrict());
		person.setCorrespondenceAddress(correspondenceAddress);

		return person;
	}

}
