package it.univpm.oop.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import it.univpm.oop.project.service.ProjectService;

/**
  * The Class Controller.
  */
@RestController
public class Controller {

	/** The service. */
	@Autowired
	private ProjectService service;
		

	/**
	 * Feed.
	 *
	 * @return the response entity
	 */
	  @GetMapping("/feed")
	  public ResponseEntity<Object> Feed(){
		return new ResponseEntity<>(service.getFeed(), HttpStatus.OK);
	  }
		

	/**
	 * Repository.
	 *
	 * @return the response entity
	 */
	  @GetMapping("/feed/comments")
	  public ResponseEntity<Object> Repository(){
			return new ResponseEntity<>(service.getRepository(), HttpStatus.OK);	
	  }
		
	/**
	 * Filtered comments.
	 *
	 * @param filter the filter
	 * @return the response entity
	 */
	@GetMapping("/feed/comments/{filter}")
	public ResponseEntity<Object> filteredComments(@PathVariable("filter") String filter) {
		return new ResponseEntity<>(service.getFilteredComments(filter),HttpStatus.OK);
	}

	/**
	 * Stats.
	 *
	 * @return the response entity
	 */
	@GetMapping("/stats")
	public ResponseEntity<Object> Stats(){
		return new ResponseEntity<>(service.getStats(),HttpStatus.OK);	
	}
		
}
