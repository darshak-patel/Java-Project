package MTTest;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

import MT01.Business;
import MT01.Person;
import MT01.Pet;

public class MTUnitTest {
	
	@Test
	public void testPersonList() {
		Pet pet1 = new Pet("Cat", 10, "A");
		Pet pet2 = new Pet("Dog", 11, "B");
		Pet pet3 = new Pet("Horse", 12, "C");
		
		List<Pet> petList = new ArrayList<Pet>();
		petList.add(pet1);
		petList.add(pet2);
		petList.add(pet3);
		
		Person person1 = new Person("Darshak", 24, petList);
		Person person2 = new Person("Akshay", 25, petList);
		Person person3 = new Person("Jay", 27, petList);
		Person person4 = new Person("Rinkesh", 23, petList);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		
		Business business1 = new Business("Race","Sarnia",person1,"N7V 3K3",personList);
		Business business2 = new Business("Horsing","Brampton",person2,"L6T 3A6",personList);
		Business business3 = new Business("Jumping","Toronto",person3,"M6V 3L3",personList);
		Business business4 = new Business("Cleaning","London",person4,"Z6T 2K3",personList);
		
		List<Business> businessList = new ArrayList<Business>();
		businessList.add(business1);
		businessList.add(business2);
		businessList.add(business3);
		businessList.add(business4);
		
		Business businessTester = new Business();
		List<Person> personTester = new ArrayList<Person>();
		personTester = businessTester.getPerson(businessList, "Cleaning");
		assertEquals(personList, personTester);
	}
	
	@Test
	public void testOwnerList() {
		Pet pet1 = new Pet("Cat", 10, "A");
		Pet pet2 = new Pet("Dog", 11, "B");
		Pet pet3 = new Pet("Horse", 12, "C");
		
		List<Pet> petList = new ArrayList<Pet>();
		petList.add(pet1);
		petList.add(pet2);
		petList.add(pet3);
		
		Person person1 = new Person("Darshak", 24, petList);
		Person person2 = new Person("Akshay", 25, petList);
		Person person3 = new Person("Jay", 27, petList);
		Person person4 = new Person("Rinkesh", 23, petList);
		Person person5 = new Person("Kuldeep", 26, petList);
		Person person6 = new Person("Miit", 23, petList);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		
		List<Person> personListTester = new ArrayList<Person>();
		personListTester.add(person1);
		personListTester.add(person2);
		
		Business business1 = new Business("Race","Sarnia",person1,"N7V 3K3",personList);
		Business business2 = new Business("Horsing","Brampton",person2,"L6T 3A6",personList);
		Business business3 = new Business("Jumping","Toronto",person5,"M6V 3L3",personList);
		Business business4 = new Business("Cleaning","London",person6,"Z6T 2K3",personList);
		
		List<Business> businessList = new ArrayList<Business>();
		businessList.add(business1);
		businessList.add(business2);
		businessList.add(business3);
		businessList.add(business4);
		
		Business businessTester = new Business();
		List<Person> personTester = new ArrayList<Person>();
		personTester = businessTester.getOwners(businessList);
		assertEquals(personListTester, personTester);
	}
	
	@Test
	public void testPetList() {
		Pet pet1 = new Pet("Cat", 10, "A");
		Pet pet2 = new Pet("Dog", 11, "B");
		Pet pet3 = new Pet("Horse", 12, "C");
		Pet pet4 = new Pet("Cow", 20, "D");
		
		List<Pet> petList = new ArrayList<Pet>();
		petList.add(pet1);
		petList.add(pet2);
		petList.add(pet3);
		
		List<Pet> petList2 = new ArrayList<Pet>();
		petList2.add(pet4);
		
		List<Pet> petListTester = new ArrayList<Pet>();
		petListTester.add(pet1);
		petListTester.add(pet2);
		petListTester.add(pet3);
		petListTester.add(pet4);
		
		Person person1 = new Person("Darshak", 24, petList);
		Person person2 = new Person("Akshay", 25, petList);
		Person person3 = new Person("Jay", 27, petList2);
		Person person4 = new Person("Rinkesh", 23, petList);
		Person person5 = new Person("Bharat", 43, petList);
		Person person6 = new Person("Kuldeep", 26, petList);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		
		Business business1 = new Business("Race","Sarnia",person1,"N7V 3K3",personList);
		Business business2 = new Business("Horsing","Brampton",person2,"L6T 3A6",personList);
		Business business3 = new Business("Jumping","Toronto",person5,"M6V 3L3",personList);
		Business business4 = new Business("Cleaning","London",person6,"Z6T 2K3",personList);
		
		List<Business> businessList = new ArrayList<Business>();
		businessList.add(business1);
		businessList.add(business2);
		businessList.add(business3);
		businessList.add(business4);
		
		Business businessTester = new Business();
		List<Pet> petTester = new ArrayList<Pet>();
		petTester = businessTester.getPet(businessList);
		assertEquals(petListTester, petTester);
	}

}
