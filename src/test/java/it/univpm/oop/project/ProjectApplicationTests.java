package it.univpm.oop.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import it.univpm.oop.project.application.ProjectApplication;
import it.univpm.oop.project.controller.Controller;
import it.univpm.oop.project.exception.FilterException;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Filter;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class ProjectApplicationTests {
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void NullPointerExTest() {
		Controller controller = new Controller();
		assertThrows(NullPointerException.class, ()-> controller.filteredComments("emo") );
	}
	
	@Test
	public void CommentTest() {
		String msg = "test";
		Comment comment = new Comment();
		comment.setMessage(msg);
		assertEquals(msg , comment.getMessage());
	}
	
	@Test
	public void FilterExTest() {
		Comment comment = new Comment();
		
		//ok
		assertThrows(FilterException.class, ()-> Filter.detectFilter("emo", comment) );
		
		//il filtro passato è corretto, infatti l'eccezione non viene lanciata
		// e mi dà failure
		assertThrows(FilterException.class, ()-> Filter.detectFilter("emoticon", comment) );
	}

}
