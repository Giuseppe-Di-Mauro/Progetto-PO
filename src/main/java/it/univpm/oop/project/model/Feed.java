package it.univpm.oop.project.model;

import java.util.ArrayList;
import java.util.List;

public class Feed {
	
	private List<Post> data = new ArrayList<>();
	

	public List<Post> getData() {
		return data;
	}

	public void setData(List<Post> data) {
		this.data = data;
	}	
	
}
