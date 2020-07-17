package it.univpm.oop.project.model;

import java.util.ArrayList;
import it.univpm.oop.project.exception.FilterException;
import it.univpm.oop.project.repository.Repository;
import it.univpm.oop.project.utils.filters.FilterEmoticon;
import it.univpm.oop.project.utils.filters.FilterHashtag;
import it.univpm.oop.project.utils.filters.FilterMedia;

/**
 * The Class Filter.
 */
public class Filter {
	
	/**
	 * Filter.
	 *
	 * @param comment the comment
	 * @return true, if successful
	 */
	public static boolean filter(Comment comment) {
		return true;
	}
	
	
	/**
	 * Filtered comments.
	 *
	 * @param repo the repository
	 * @param filter the filter
	 * @return the array list
	 */
	public static ArrayList <Comment> filteredComments(Repository repo, String filter) {
		
		ArrayList <Comment> list = new ArrayList <>();
		try {
		for(Comment comment: repo.getComments()) {
				boolean ok = Filter.detectFilter(filter, comment);
				if(ok) list.add(comment);
		}
		} catch (FilterException e) {
			e.printStackTrace();
		}
		return (ArrayList<Comment>) list;
	}
	
	/**
	 * Detect filter.
	 *
	 * @param filter the filter
	 * @param comment the comment
	 * @return true, if successful
	 * @throws FilterException the filter exception
	 */
	public static boolean detectFilter(String filter, Comment comment) throws FilterException {
		if (filter.equals("emoticon")) return FilterEmoticon.filter(comment);
		if (filter.equals("hashtag")) return FilterHashtag.filter(comment);
		if (filter.equals("media")) return FilterMedia.filter(comment);
		else { 
			throw new FilterException("Filter not valid");
		}
	}
}
