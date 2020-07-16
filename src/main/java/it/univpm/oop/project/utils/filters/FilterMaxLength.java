package it.univpm.oop.project.utils.filters;

import it.univpm.oop.project.model.Feed;
import it.univpm.oop.project.model.Filter;
import it.univpm.oop.project.utils.FeedParser;

public class FilterMaxLength extends Filter {
	
	public boolean filter(Feed feed) {
		if(FeedParser.getStats(feed).getMaxCommentsLength()>0) return true;
		return false;
	}
	
}