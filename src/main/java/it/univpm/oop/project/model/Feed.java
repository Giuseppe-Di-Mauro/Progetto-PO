package it.univpm.oop.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Feed.
 */
public class Feed {
	
	/** The data. */
	private List<Post> data = new ArrayList<>();
	

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public List<Post> getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(List<Post> data) {
		this.data = data;
	}	
	
}
