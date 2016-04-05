/**
 *
 */
package pl.inferno.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author lukasz
 *
 */
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Size(max = 128)
	@Column(name = "street", nullable = false)
	private String street;

	@NotNull
	@Size(max = 5)
	@Column(name = "building_nr", nullable = false)
	private String buildingNumber;

	@Size(max = 10)
	@Column(name = "flat_nr")
	private String flatNumber;

	@NotNull
	@Size(max = 250)
	@Column(name = "city", nullable = false)
	private String city;

	@NotNull
	@Size(max = 250)
	@Column(name = "district", nullable = false)
	private String district;

	@NotNull
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	@Column()
	private String postCode;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
}
