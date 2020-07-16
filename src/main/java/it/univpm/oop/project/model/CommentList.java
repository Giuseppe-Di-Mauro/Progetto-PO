package it.univpm.oop.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class CommentList.
 */
public class CommentList {
	
	/** The data. */
	private List<Comment> data= new ArrayList<>();

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public List<Comment> getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(List<Comment> data) {
		this.data = data;
	}
	
}
