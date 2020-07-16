package it.univpm.oop.project.utils.filters;
import it.univpm.oop.project.model.*;
import it.univpm.oop.project.utils.FeedParser;

public class FilterHashtag extends Filter{
	
	public boolean filter(Feed feed) {
		if(FeedParser.getStats(feed).getHashtagComments()>0) return true;
		return false;
	}
}
