package it.univpm.oop.project.utils;

import java.util.List;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.repository.Repository;

public class RepoFiller {
	public static Repository fillRepo(List<List<Comment>> list) {
		List<Comment> l2= null;
			for(List<Comment> l1: list) {
				for(Comment comm: l1) {
					l2.add(comm);
				}
			}
			
		return new Repository(l2);
	
	}
}
