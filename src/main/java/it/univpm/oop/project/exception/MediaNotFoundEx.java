package it.univpm.oop.project.exception;

/**
 * The Class MediaNotFoundEx.
 */
public class MediaNotFoundEx extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -9178400518901835497L;

	/**
	 * Instantiates a new media not found ex.
	 */
	public MediaNotFoundEx() {
		super();
	}

	/**
	 * Instantiates a new media not found ex.
	 *
	 * @param message the message
	 */
	public MediaNotFoundEx(String message) {
		super(message);
	}

}
