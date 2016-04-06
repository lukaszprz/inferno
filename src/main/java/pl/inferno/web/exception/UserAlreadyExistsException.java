/**
 *
 */
package pl.inferno.web.exception;

/**
 * @author lukasz
 *
 */
public class UserAlreadyExistsException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1917722443255899324L;

	/**
	 * @param message
	 */
	public UserAlreadyExistsException(String message) {
		super(message);
	}

}
