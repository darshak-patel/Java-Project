package ca.lambton.c0774071_Project;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DaoController {

	@Autowired
	private UserServiceImpl userService;

	@PostMapping("/process_register")
	public String processRegister(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "signup_form";
		}

		userService.addUser(user);

		return "register_success";
	}

	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = (List<User>) userService.findAllUsers();
		model.addAttribute("listUsers", listUsers);

		return "users";
	}

	@RequestMapping(value = "/process_login", method = RequestMethod.POST)
	public String processLogin(@RequestParam("email") String email, @RequestParam("password") String password) {
		User user = userService.findByEmail(email);
		if (user == null || !user.getPassword().equals(password)) {
			return "login_unsuccessful";
		} else {
			return "index";
		}
	}

	@RequestMapping(value = "/filterByName", method = RequestMethod.GET)
	public String processFilter(@RequestParam("firstName") String firstName, Model model) {
		ArrayList<User> users = new ArrayList<User>();
		users = userService.findByFirstName(firstName);
		if (users.isEmpty()) {
			return "search_unsuccess";
		} else {
			model.addAttribute("users", users);
			return "search_result";
		}

	}
}
