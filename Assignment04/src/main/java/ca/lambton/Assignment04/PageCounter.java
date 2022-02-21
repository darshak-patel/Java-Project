package ca.lambton.Assignment04;

import lombok.Getter;

@Getter
public class PageCounter {

	int pageCount;

	public PageCounter() {
		this.pageCount = 0;
	}
	
	public void incrementCount() {
		this.pageCount++;
	}
	
}
