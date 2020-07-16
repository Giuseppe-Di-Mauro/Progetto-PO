package it.univpm.oop.project.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.net.MalformedURLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import it.univpm.oop.project.model.Feed;
import it.univpm.oop.project.model.Stats;
import it.univpm.oop.project.repository.Repository;
import it.univpm.oop.project.service.ProjectService;
import it.univpm.oop.project.utils.FeedParser;
import it.univpm.oop.project.utils.RepoFiller;

/**
 * The SpringBoot Application starts.
 * @author Andrea and Giuseppe
 *
 */
@SpringBootApplication
@ComponentScan({"it.univpm.oop.project.controller", "it.univpm.oop.project.utils","it.univpm.oop.project.service"})
public class ProjectApplication {

	private static final Logger log = LoggerFactory.getLogger(ProjectApplication.class);

	public static void main(String[] args) throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			String fields = "{id,attachment,message}";
			String url="https://graph.facebook.com/v7.0/me/feed?access_token=EAAIi8ZAbkTG4BAMyU5TNZBPa4ZAcaaU9O7XjWpVMYFLN8uwPCIYhXY5wgBSShMHEACZAMlcIPwzfxywa1nEBY7arBSiZAGCytCxnP5ZB9feoOVLR6YFKivGHVLUlYKpq7If1XsZCN3gA9ZC12ZCi9SgwEZB9owNuAuzp7Ur2KZCwcFOFEIy9GR9VAcZA\n" + 
					"&__activeScenarioIDs=%5B%5D&__activeScenarios=%5B%5D&debug=all&format=json&method=get&pretty=0&suppress_http_code=1&transport=cors&limit=1000&fields=comments{fields}";
			//per il service /feed
			Feed feed = restTemplate.getForObject(url, Feed.class, fields);
			ProjectService.setFeed(feed);
			
			//per il service /feed/comments
			Feed fed = restTemplate.getForObject(url, Feed.class, fields);
			Repository repo = RepoFiller.fillRepo(fed);
			ProjectService.setComments(repo);
			
			//per il service /stats
			Stats stats = FeedParser.getStats(feed);
			ProjectService.setStats(stats);
			
		};
	}
	
}

	