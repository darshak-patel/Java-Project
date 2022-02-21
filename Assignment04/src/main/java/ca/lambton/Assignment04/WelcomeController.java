package ca.lambton.Assignment04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class WelcomeController {
	
	@Autowired
	private PageCounter pageCounter;
	
	@GetMapping("/")
	public String welcome(Model model, @ModelAttribute("pageCouner") PageCounter counter) {
		pageCounter.incrementCount();
		model.addAttribute("counter", pageCounter.getPageCount());
		return "welcome";
	}

}
