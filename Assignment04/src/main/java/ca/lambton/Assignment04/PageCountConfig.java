package ca.lambton.Assignment04;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class PageCountConfig {
	
	@Bean
	public PageCounter pageCount() {
		return new PageCounter();
	}
}
