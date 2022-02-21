package ca.lambton.c0774071_Project;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class PageHitCounter {

	private int i;

	public PageHitCounter() {
		i = 0;
	}

	public int getHits() {
		return i;
	}

	public void addHit() {
		i++;
	}
}
