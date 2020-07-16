package it.univpm.oop.project.utils;

import java.util.ArrayList;
import java.util.List;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Feed;
import it.univpm.oop.project.repository.Repository;

public class RepoFiller {
	
	public static Repository fillRepo(Feed feed) {
		
		ArrayList<ArrayList<Comment>> list = new ArrayList<ArrayList<Comment>>();
		for(int i=0; i<feed.getData().size() ; i++) {
			list.add((ArrayList<Comment>) feed.getData().get(i).getComments().getData());
		}
		ArrayList<Comment> l2= new ArrayList<>();
			for(List<Comment> l1: list) {
				for(Comment comm: l1) {
					l2.add(comm);
				}
			}
			
		return new Repository(l2);
	
	}
}

