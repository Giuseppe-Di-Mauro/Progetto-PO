package it.univpm.oop.project.repository;
/**
 * Qui salviamo la lista di soli commenti
 * @author Andrea
 *
 */

import java.util.ArrayList;
import java.util.List;

import it.univpm.oop.project.model.Comment;

public class Repository {

	/*public void storeFeed(Feed feed){
	try{
	 	ObjectInputStream in= new ObjectInputStream(new BufferedInputStream( new FileInputStream("SERIALIZZA.dat")));
	 	for(Post post: feed) {
	 		in.readObject();}
		in.close(); 
	} catch (ClassNotFoundException ex) {
		System.out.println("Manca l'oggetto");
		System.out.println(ex);
	} catch (IOException e) {
		System.out.println("Errore di I/O");
		System.out.println(e);}
	}*/
    
	private List<Comment> comments = new ArrayList<>();

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	
	public Repository(List<Comment> comments) {
		super();
		this.comments = comments;
	}

	
	
}

    

  