package ca.lambton.c0774071_Project;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	ArrayList<User> findByFirstName(String name);

	User findByEmail(String email);
  
}
