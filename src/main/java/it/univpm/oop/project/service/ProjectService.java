package it.univpm.oop.project.service;

import org.springframework.stereotype.Service;
import it.univpm.oop.project.exception.FilterException;
import it.univpm.oop.project.model.*;
import it.univpm.oop.project.repository.Repository;

/**
 * The class that provides the principal function of the app
 * @author Giuseppe
 *
 */
@Service
public class ProjectService {
	private static Feed feed;
	private static Stats stats;
	private static Repository comments;

	/*public List<Course> retrieveCourses(String studentId) {
		Student student = retrieveStudent(studentId);
		
		if(studentId.equalsIgnoreCase("Student1")){
			throw new RuntimeException("Something went wrong");
		}

		if (student == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return student.getCourses();
	}*/
	public Repository getComments() {
		return comments;
	}

	public static void setComments(Repository comments) {
		ProjectService.comments = comments;
	}

	public Feed getFeed() {
		return feed;
	}

	public static void setFeed(Feed feed) {
		ProjectService.feed = feed;
	}

	public Stats getStats() {
		return stats;
	}

	public static void setStats(Stats stats) {
		ProjectService.stats = stats;
	}


	public String detectFilter(String filter) throws FilterException {
		if (filter.equals("averageLength"))
			return "average";
		if (filter.equals("emoticon"))
			return "emoticon";
		if (filter.equals("hashtag"))
			return "hashtag";
		else
			throw new FilterException("Filter not valid for the stats");
	} 
}