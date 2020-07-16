package it.univpm.oop.project.model;

/**
 * The Class Post.
 */
public class Post {
	
	/** The id. */
	private String id;
	
	/** The comments. */
	private CommentList comments;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	public CommentList getComments() {
		return comments;
	}
	
	/**
	 * Sets the comments.
	 *
	 * @param comments the new comments
	 */
	public void setComments(CommentList comments) {
		this.comments = comments;
	}
	
	
}
