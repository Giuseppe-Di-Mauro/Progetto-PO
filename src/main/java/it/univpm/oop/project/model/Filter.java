package it.univpm.oop.project.model;

import java.util.ArrayList;

public class Filter {
	
	public boolean filter (Feed feed) {
		return true;
	}
	
	
	public ArrayList <Comment> filteredComments(Object param1, Object param2) {
		
		ArrayList <Comment> positiveComments = new ArrayList <>();
	//	Database database = new Database();
	//	FrontDatabase frontDatabase = new FrontDatabase();
		
		for (int i = 0; i < repo.getDatabase().size(); i++){
			if (filter(repo.getDatabase().elementAt(i), param1, param2)) {
				positiveComments.add(repo.getFrontDatabase().elementAt(i));
			}
		}
		return positiveComments;
	}
}
