/**
 *
 */
package pl.inferno.web.model.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author lukasz
 *
 */
public class UserForm {

	@NotEmpty
	@Size(min = 3, max = 25)
	private String username;

	@NotEmpty
	@Size(min = 3, max = 25)
	private String password;

	/**
	 * @return the login
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserForm [username=" + username + ", password=" + password + "]";
	}

}
