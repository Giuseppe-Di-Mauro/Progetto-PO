package it.univpm.oop.project.utils.filters;

import com.vdurmont.emoji.EmojiManager;

import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Filter;

public class FilterEmoticon extends Filter {
	
	public static boolean filter(Comment comment) {
		try {
		if(EmojiManager.containsEmoji(comment.getMessage())) return true;
		} catch (NullPointerException e) {}
		return false;
	}
}