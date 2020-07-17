package it.univpm.oop.project.exception;

/**
 * The Class FilterException.
 */
public class FilterException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6709863867521990083L;

	/**
	 * Instantiates a new filter exception.
	 */
	public FilterException() {
		super();
	}
	
	/**
	 * Instantiates a new filter exception.
	 *
	 * @param message the message
	 */
	public FilterException(String message) {
		super(message);
	}

}
