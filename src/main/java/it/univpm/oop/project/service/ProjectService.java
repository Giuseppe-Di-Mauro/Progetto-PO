package it.univpm.oop.project.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
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
	private static Repository repository;

	public Repository getRepository() {
		return repository;
	}

	public static void setRepository(Repository repo) {
		ProjectService.repository = repo;
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
	
	public ArrayList<Comment> getFilteredComments(String filter) {
		return (ArrayList<Comment>) Filter.filteredComments(this.getRepository(), filter);
	}
	 
}