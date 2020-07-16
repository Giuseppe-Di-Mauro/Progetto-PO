package it.univpm.oop.project.utils.filters;

import it.univpm.oop.project.model.Attachment;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Filter;

public class FilterMedia extends Filter {
	
	public static boolean filter(Comment comment) {
		try {
        Attachment attach= comment.getAttachment();
        String src = attach.getMedia().getImage().getSrc();
        if(src!=null) return true;
        } catch (NullPointerException e) {}
		return false;
	}
}
	
