package ca.lambton.c0774071_Project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	@Override
	public ArrayList<User> findByFirstName(String name) {
		return userRepository.findByFirstName(name);
	}
	
	@Override
    public void addUser(User user){
        userRepository.save(user);
    }
	
	@Override
	public ArrayList<User> findAllUsers() {
		return (ArrayList<User>) userRepository.findAll();
	}
}
