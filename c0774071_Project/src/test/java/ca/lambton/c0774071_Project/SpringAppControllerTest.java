package ca.lambton.c0774071_Project;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(AppController.class)
class SpringAppControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void viewHomePageTest() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(view().name("home"));
	}

	@Test
	public void showRegistrationFormTest() throws Exception {
		this.mockMvc.perform(get("/register")).andDo(print()).andExpect(status().isOk())
				.andExpect(view().name("signup_form")).andExpect(model().attribute("user", new User()));
	}

	@Test
	public void loginTest() throws Exception
	{
		this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk()).andExpect(view().name("login"));
	}
	
	@Test
	public void indexTest() throws Exception
	{
		this.mockMvc.perform(get("/index")).andDo(print()).andExpect(status().isOk()).andExpect(view().name("index"));
	}
	
	@Test
	public void aboutTest() throws Exception
	{
		this.mockMvc.perform(get("/about")).andDo(print()).andExpect(status().isOk()).andExpect(view().name("about"));
	}
	
	@Test
	public void totalHitsTest() throws Exception
	{
		this.mockMvc.perform(get("/totalHits")).andDo(print()).andExpect(status().isOk()).andExpect(view().name("hits"));
	}
}
