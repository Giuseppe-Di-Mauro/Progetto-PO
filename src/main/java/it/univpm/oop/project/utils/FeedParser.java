package it.univpm.oop.project.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.vdurmont.emoji.EmojiManager;
import it.univpm.oop.project.model.Attachment;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Feed;
import it.univpm.oop.project.model.Post;
import it.univpm.oop.project.model.Stats;


/**
 * The Class FeedParser.
 */
public class FeedParser {
	

	/**
	 * Gets the stats.
	 *
	 * @param feed the feed
	 * @return the stats
	 */
	public static Stats getStats(Feed feed) {
		
		int emoticonComments = 0;
		int hashtagComments = 0 ;
		int mediaComments = 0;
		int sumCommentsLength = 0;
		int numberComments = 0;
		int minCommentsLength = 2147483647;
		int maxCommentsLength = 0;
		double averageCommentsLength = 0.0;
		try {
		for (int i=0; i<feed.getData().size(); i++) {
			Post post = feed.getData().get(i); 
			for (int j=0; j<post.getComments().getData().size(); j++) {
				Comment comment = post.getComments().getData().get(j);
				String message = comment.getMessage();
				try{numberComments++;
				sumCommentsLength += message.length();
				if(message.length()>maxCommentsLength) maxCommentsLength= message.length();
				if(message.length()<minCommentsLength) minCommentsLength= message.length();
				} catch (NullPointerException e) {e.printStackTrace();};
				
				//hashtag
				try{
				Pattern patt = Pattern.compile("(#\\w+)\\b");
	            Matcher match = patt.matcher(message);
	            if(match.find())  hashtagComments++;  
				} catch (NullPointerException e) {e.printStackTrace();} 
				
	            
	            //emoticon
				try {
	            if(EmojiManager.containsEmoji(message)) emoticonComments++;
				} catch (NullPointerException e) {e.printStackTrace();};
				
				
	            //media
				try {
					Attachment attach = comment.getAttachment();
					if(!attach.equals(null)) {
						String src = attach.getMedia().getImage().getSrc();
						if(!src.equals(null)) mediaComments++;
						}
					} catch (NullPointerException e) {e.printStackTrace();};
	            
			}
			
		}
		averageCommentsLength = sumCommentsLength / numberComments;
		} catch (NullPointerException e) {e.printStackTrace();};
		
		return new Stats( mediaComments,  hashtagComments,  sumCommentsLength,  averageCommentsLength,
				 minCommentsLength,  maxCommentsLength,  emoticonComments);
		 
	
	}
	
	
	
}
