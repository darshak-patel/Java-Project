package ca.lambton.c0774071_Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class UserDb {
	
	private List<User> users;
	
	public UserDb() {
		this.users = new ArrayList<User>();
	}
	
	public User getUser(String name) {
		return users.stream().filter(u -> u.getName().equals(name)).findAny().orElse(null);
	}
	
	public List<User> getUsers(int salary, int age) {
		return users.stream().filter(a -> a.getAge() < age).filter(s -> s.getOccupation().getSalary() >= salary).collect(Collectors.toList());
	}	

	public void addUser(User user) {
		users.add(user);
	}
}
