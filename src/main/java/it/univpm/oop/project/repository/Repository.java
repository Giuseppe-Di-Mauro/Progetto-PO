package it.univpm.oop.project.repository;

import java.util.ArrayList;
import java.util.List;
import it.univpm.oop.project.model.Comment;

/**
 * The Class Repository.
 */
public class Repository {
    
	/** The comments. */
	private List<Comment> comments = new ArrayList<>();

	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * Sets the comments.
	 *
	 * @param comments the new comments
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	
	/**
	 * Instantiates a new repository.
	 *
	 * @param comments the comments
	 */
	public Repository(List<Comment> comments) {
		super();
		this.comments = comments;
	}

	
	
}

    

  