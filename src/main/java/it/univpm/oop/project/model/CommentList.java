package it.univpm.oop.project.model;

import java.util.ArrayList;
import java.util.List;

public class CommentList {
	private List<Comment> data= new ArrayList<>();

	public List<Comment> getData() {
		return data;
	}

	public void setData(List<Comment> data) {
		this.data = data;
	}
	
}
