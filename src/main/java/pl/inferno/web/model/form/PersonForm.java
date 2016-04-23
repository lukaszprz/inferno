/**
 *
 */
package pl.inferno.web.model.form;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import pl.inferno.validation.annotation.Pesel;

/**
 * @author lukasz
 *
 */
public class PersonForm {

	@NotEmpty
	@Size(max = 25)
	private String firstName;

	@NotEmpty
	@Size(max = 125)
	private String lastName;

	@Pesel
	private String pesel;

	@Valid
	private AddressForm address;

	@Valid
	private AddressForm correspondenceAddress;

	private boolean otherCorrespondenceAddress = false;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter for pesel
	 *
	 * @return the pesel
	 */
	public String getPesel() {
		return pesel;
	}

	/**
	 * Setter for pesel
	 *
	 * @param pesel
	 *            the pesel to set
	 */
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	/**
	 * Getter for address
	 *
	 * @return the address
	 */
	public AddressForm getAddress() {
		return address;
	}

	/**
	 * Setter for address
	 *
	 * @param address
	 *            the address to set
	 */
	public void setAddress(AddressForm address) {
		this.address = address;
	}

	/**
	 * Getter for correspondenceAddress
	 *
	 * @return the correspondenceAddress
	 */
	public AddressForm getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	/**
	 * Setter for correspondenceAddress
	 *
	 * @param correspondenceAddress
	 *            the correspondenceAddress to set
	 */
	public void setCorrespondenceAddress(AddressForm correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	/**
	 * Getter for otherCorrespondenceAddress
	 *
	 * @return the otherCorrespondenceAddress
	 */
	public boolean isOtherCorrespondenceAddress() {
		return otherCorrespondenceAddress;
	}

	/**
	 * Setter for otherCorrespondenceAddress
	 *
	 * @param otherCorrespondenceAddress
	 *            the otherCorrespondenceAddress to set
	 */
	public void setOtherCorrespondenceAddress(boolean otherCorrespondenceAddress) {
		this.otherCorrespondenceAddress = otherCorrespondenceAddress;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
		        "PersonForm [firstName=%s, lastName=%s, pesel=%s, address=%s, correspondenceAddress=%s, otherCorrespondenceAddress=%s]",
		        firstName, lastName, pesel, address, correspondenceAddress, otherCorrespondenceAddress);
	}

}
