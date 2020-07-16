package it.univpm.oop.project.model;

public class Post {
	private String id;
	private CommentList comments;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public CommentList getComments() {
		return comments;
	}
	public void setComments(CommentList comments) {
		this.comments = comments;
	}
	
	
}
