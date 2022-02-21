package ca.lambton.c0774071_Project;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	public User findByEmail(String email);
    public ArrayList<User> findByFirstName(String name);
    public void addUser(User user);
    public ArrayList<User> findAllUsers();
}
