package it.univpm.oop.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import it.univpm.oop.project.controller.Controller;
import it.univpm.oop.project.exception.FilterException;
import it.univpm.oop.project.model.Feed;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ProjectApplicationTests {
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void contextLoads() {
		Controller controller = new Controller();
		assertThrows(FilterException.class, ()-> controller.filteredComments("emo") );
	}
	
	@Test
	public void contextLoads2() {
		Controller controller = new Controller();
		Feed feed = new Feed();
		assertEquals(controller.Feed(), feed);
	}
}
