package ca.lambton.c0774071_Exam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@Autowired
	private UserDb userDb;

	@GetMapping("/users")
	public String users(Model model) {
		model.addAttribute("userDb", userDb.getUsers());
		return "users";
	}

}
