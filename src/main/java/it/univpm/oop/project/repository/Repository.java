package it.univpm.oop.project.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Feed;
import java.io.*;

/**
 * The Class Repository.
 */
public class Repository {

	/*public void storeFeed(Feed feed) throws ClassNotFoundException{
		try{
		 	ObjectOutputStream out= new ObjectOutputStream( new FileOutputStream("SERIALIZZA.txt"));
		 	out.writeObject(feed);
		 	out.close(); 
		} catch (IOException e) {
			System.out.println("Errore di I/O");
			System.out.println(e);}
		}*/
    
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

    

  