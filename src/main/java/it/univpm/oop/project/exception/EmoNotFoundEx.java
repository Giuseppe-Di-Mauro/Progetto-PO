package it.univpm.oop.project.exception;

public class EmoNotFoundEx extends Exception{

	private static final long serialVersionUID = 3121678178623311561L;

	public EmoNotFoundEx() {
		super();
	}

	public EmoNotFoundEx(String message) {
		super(message);
	}

}
