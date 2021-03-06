package A01;

import java.util.Optional;

public class Person {
	
	private String name;
	private int age;
	Optional<Dog> dog;
	
	public Person(String name, int age) {
		this(name, age, null);
	}
	
	public Person(String name, int age, Dog dog) {
		this.name = name;
		this.age = age;
		this.dog = Optional.ofNullable(dog);
	}
	
	public boolean hasOldDog() {
		return(this.dog.isPresent() && this.dog.get().getAge() >= 10);
				
	}

	public void changeDogsName(String newName) {
		this.dog.map(i -> i.name = newName).orElseThrow(() -> new RuntimeException(this.name + " does not own a dog!"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Optional<Dog> getDog() {
		return dog;
	}

	public void setDog(Optional<Dog> dog) {
		this.dog = dog;
	}
	
}
