/**
 * File AddressForm.java created on 23 kwi 2016 20:53:20 by Łukasz Przesmycki (lukasz)
 */
package pl.inferno.web.model.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <p>
 * inferno-web
 * </p>
 * <p>
 * AddressForm
 * </p>
 *
 * @author lukasz
 *
 */
public class AddressForm {

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
	 * Getter for street
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Setter for street
	 *
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Getter for buildingNumber
	 *
	 * @return the buildingNumber
	 */
	public String getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 * Setter for buildingNumber
	 *
	 * @param buildingNumber
	 *            the buildingNumber to set
	 */
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	/**
	 * Getter for flatNumber
	 *
	 * @return the flatNumber
	 */
	public String getFlatNumber() {
		return flatNumber;
	}

	/**
	 * Setter for flatNumber
	 *
	 * @param flatNumber
	 *            the flatNumber to set
	 */
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	/**
	 * Getter for city
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter for city
	 *
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter for district
	 *
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * Setter for district
	 *
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * Getter for postCode
	 *
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * Setter for postCode
	 *
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
		return String.format(
		        "AddressForm [street=%s, buildingNumber=%s, flatNumber=%s, city=%s, district=%s, postCode=%s]", street,
		        buildingNumber, flatNumber, city, district, postCode);
	}

}
