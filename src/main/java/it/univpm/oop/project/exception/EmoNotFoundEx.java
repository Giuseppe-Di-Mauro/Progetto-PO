package it.univpm.oop.project.exception;

/**
 * The Class EmoNotFoundEx.
 */
public class EmoNotFoundEx extends RuntimeException{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3121678178623311561L;

	/**
	 * Instantiates a new emo not found ex.
	 */
	public EmoNotFoundEx() {
		super();
	}

	/**
	 * Instantiates a new emo not found ex.
	 *
	 * @param message the message
	 */
	public EmoNotFoundEx(String message) {
		super(message);
	}

}
