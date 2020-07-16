package it.univpm.oop.project.utils.filters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Filter;

/**
 * The Class FilterHashtag.
 */
public class FilterHashtag extends Filter {
	
	/**
	 * Filter.
	 *
	 * @param comment the comment
	 * @return true, if successful
	 */
	public static boolean filter(Comment comment) {
		try {
		Pattern patt = Pattern.compile("(#\\w+)\\b");
        Matcher match = patt.matcher(comment.getMessage());
		if(match.find()) return true;
		} catch (NullPointerException e) {}
		return false;
	}
}
