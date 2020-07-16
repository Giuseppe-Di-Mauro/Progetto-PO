package it.univpm.oop.project.model;


import java.util.ArrayList;
import it.univpm.oop.project.exception.FilterException;
import it.univpm.oop.project.repository.Repository;
import it.univpm.oop.project.utils.filters.FilterEmoticon;
import it.univpm.oop.project.utils.filters.FilterHashtag;
import it.univpm.oop.project.utils.filters.FilterMedia;


public class Filter {
	
	public static boolean filter(Comment comment) {
		return true;
	}
	
	
	public static ArrayList <Comment> filteredComments(Repository repo, String filter) {
		
		ArrayList <Comment> list = new ArrayList <>();
		for(Comment comment: repo.getComments()) {
			try {
				boolean ok = Filter.detectFilter(filter, comment);
				if(ok) list.add(comment);
			} catch (FilterException e) {
				e.printStackTrace();
			}
		}
	
		return (ArrayList<Comment>) list;
	}
	
	public static boolean detectFilter(String filter, Comment comment) throws FilterException {
		if (filter.equals("emoticon")) return FilterEmoticon.filter(comment);
		if (filter.equals("hashtag")) return FilterHashtag.filter(comment);
		if (filter.equals("media")) return FilterMedia.filter(comment);
		else { 
			throw new FilterException("Filter not valid");
		}
	}
}
