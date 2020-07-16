package it.univpm.oop.project.utils.filters;

import com.vdurmont.emoji.EmojiManager;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Filter;

/**
 * The Class FilterEmoticon.
 */
public class FilterEmoticon extends Filter {
	
	/**
	 * Filter.
	 *
	 * @param comment the comment
	 * @return true, if successful
	 */
	public static boolean filter(Comment comment) {
		try {
		if(EmojiManager.containsEmoji(comment.getMessage())) return true;
		} catch (NullPointerException e) {}
		return false;
	}
}