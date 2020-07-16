package it.univpm.oop.project.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import it.univpm.oop.project.model.*;
import it.univpm.oop.project.repository.Repository;


/**
 * The Class ProjectService.
 */
@Service
public class ProjectService {
	
	/** The feed. */
	private static Feed feed;
	
	/** The stats. */
	private static Stats stats;
	
	/** The repository. */
	private static Repository repository;

	/**
	 * Gets the repository.
	 *
	 * @return the repository
	 */
	public Repository getRepository() {
		return repository;
	}

	/**
	 * Sets the repository.
	 *
	 * @param repo the new repository
	 */
	public static void setRepository(Repository repo) {
		ProjectService.repository = repo;
	}

	/**
	 * Gets the feed.
	 *
	 * @return the feed
	 */
	public Feed getFeed() {
		return feed;
	}

	/**
	 * Sets the feed.
	 *
	 * @param feed the new feed
	 */
	public static void setFeed(Feed feed) {
		ProjectService.feed = feed;
	}

	/**
	 * Gets the stats.
	 *
	 * @return the stats
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Sets the stats.
	 *
	 * @param stats the new stats
	 */
	public static void setStats(Stats stats) {
		ProjectService.stats = stats;
	}
	
	/**
	 * Gets the filtered comments.
	 *
	 * @param filter the filter
	 * @return the filtered comments
	 */
	public ArrayList<Comment> getFilteredComments(String filter) {
		return (ArrayList<Comment>) Filter.filteredComments(this.getRepository(), filter);
	}
	 
}