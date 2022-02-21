package ca.lambton.c0774071_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageHitController {

	@Autowired
	PageHitCounter pageHitCounter;
	
	@GetMapping("getHits")
	public Integer getHits() {
		return pageHitCounter.getHits();
	}
}
