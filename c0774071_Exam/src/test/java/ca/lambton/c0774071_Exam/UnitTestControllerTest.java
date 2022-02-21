package ca.lambton.c0774071_Exam;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(MainController.class)
class UnitTestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserDb userDb;
	
	@Test
	public void usersTest() throws Exception {
		this.mockMvc.perform(get("/users"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(view().name("users"))
			.andExpect(model().attribute("userDb", userDb.getUsers()));
	}
	
	@Test
	public void recursionTest() {
		String testPatternString = ExamQuestions.recursionPattern(1);
		Assert.assertEquals("*\n",testPatternString);
	}
	
	
}
