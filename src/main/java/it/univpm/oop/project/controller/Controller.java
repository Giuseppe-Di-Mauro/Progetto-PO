package it.univpm.oop.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
			return new ResponseEntity<>(service.getComments(), HttpStatus.OK);	
		}
		
		
		/**
		 * GET /Comments(Filter)
		 * @return the comments filtered
		 */
		/*@GetMapping("/FilterComments")
		public ResponseEntity<Object> getComments(@RequestBody String filter) {
			return new ResponseEntity<>(service,HttpStatus.OK);
		}*/
		
		
		/**
		 * GET /Stats 
		 * @return all the stats
		 */
		@GetMapping("/stats")
		public ResponseEntity<Object> Stats(){
			return new ResponseEntity<>(service.getStats(),HttpStatus.OK);	
		}
		
		
		/**
		 * GET /Stats(Filter)
		 * @return the stats filtered
		 */
	//	@GetMapping("/FilterStats")
	//	public ResponseEntity<Object> getStatistics(@RequestBody String filter) throws FormatException, MismatchTypeFilterException, FieldException, OperatorException{
	//		return new ResponseEntity<>(service.getStats(filter),HttpStatus.OK);
	//			
	//	}
		
}
