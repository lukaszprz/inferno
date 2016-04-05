/**
 *
 */
package pl.inferno.web.model.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.google.common.base.Objects;

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

	@NotEmpty
	@Size(max = 128)
	private String street;

	@NotEmpty
	@Size(max = 5)
	private String buildingNumber;

	@Size(max = 5)
	private String flatNumber;

	@NotEmpty
	@Size(max = 250)
	private String city;

	@NotEmpty
	@Size(max = 250)
	private String district;

	@NotEmpty
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	private String postCode;

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
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the buildingNumber
	 */
	public String getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 * @param buildingNumber
	 *            the buildingNumber to set
	 */
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	/**
	 * @return the flatNumber
	 */
	public String getFlatNumber() {
		return flatNumber;
	}

	/**
	 * @param flatNumber
	 *            the flatNumber to set
	 */
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode
	 *            the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return Objects.toStringHelper(this).add("firstName", firstName).add("lastName", lastName).add("street", street)
		        .add("buildingNumber", buildingNumber).add("flatNumber", flatNumber).add("city", city)
		        .add("district", district).add("postCode", postCode).toString();
	}

}
