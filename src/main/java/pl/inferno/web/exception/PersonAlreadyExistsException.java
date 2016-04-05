/**
 *
 */
package pl.inferno.web.exception;

/**
 * @author lukasz
 *
 */
public class PersonAlreadyExistsException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 715361533481699907L;

	/**
	 * @param message
	 */
	public PersonAlreadyExistsException(String message) {
		super(message);
	}

}
