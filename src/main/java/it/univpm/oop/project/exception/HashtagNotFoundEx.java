package it.univpm.oop.project.exception;

/**
 * The Class HashtagNotFoundEx.
 */
public class HashtagNotFoundEx extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7699845908825717006L;

	/**
	 * Instantiates a new hashtag not found ex.
	 */
	public HashtagNotFoundEx() {
		super();
	}

	/**
	 * Instantiates a new hashtag not found ex.
	 *
	 * @param message the message
	 */
	public HashtagNotFoundEx(String message) {
		super(message);
	}
	
}
