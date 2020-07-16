package it.univpm.oop.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import it.univpm.oop.project.service.ProjectService;

/**
	 * Controller for PostMan
	 * @author Andrea and Giuseppe
	 *
	 */
	@RestController
	public class Controller {
		/**
		 * The service that provides all the requests
		 */	
		@Autowired
	    private ProjectService service;
		/*
		@GetMapping("/students/{studentId}/courses")
		public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
			return studentService.retrieveCourses(studentId);
		}
		/**
		 * GET /Feed
		 * @return all the feed
		 */
		@GetMapping("/feed")
		public ResponseEntity<Object> Feed(){
			return new ResponseEntity<>(service.getFeed(), HttpStatus.OK);
		}
		/**
		 * GET /feed/comments
		 * @return all the comments 
		 */
		@GetMapping("/feed/comments")
		public ResponseEntity<Object> Repository(){
			return new ResponseEntity<>(service.getRepository(), HttpStatus.OK);	
		}
		
		
		/**
		 * GET /Comments(Filter)
		 * @return the comments filtered
		 */
		@GetMapping("/feed/comments/{filter}")
		public ResponseEntity<Object> filteredComments(@PathVariable("filter") String filter) {
			return new ResponseEntity<>(service.getFilteredComments(filter),HttpStatus.OK);
		}
		
		
		/**
		 * GET /Stats 
		 * @return all the stats
		 */
		@GetMapping("/stats")
		public ResponseEntity<Object> Stats(){
			return new ResponseEntity<>(service.getStats(),HttpStatus.OK);	
		}
		
		
}
