package MT01;

import java.util.*;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Business {
	private String name;
	private String address;
	private Person owner;
	private String postalCode;
	private List<Person> customers;
	
	public List<Person> getPerson(List<Business> businessList,String name) {
		return businessList.stream()
					.filter(x -> x.getName().equals(name))
					.flatMap(customer -> customer.getCustomers().stream())
					.collect(Collectors.toList());
	}
	
	public List<Person> getOwners(List<Business> businessList) {
		return businessList.stream()
				.filter(x -> x.getCustomers().contains(x.getOwner()))
				.map(i -> i.getOwner())
				.collect(Collectors.toList());
	}
	
	public List<Pet> getPet(List<Business> businessList) {
		return businessList.stream()
				.flatMap(x -> x.getCustomers().stream())
				.flatMap(pet -> pet.getPet().stream())
				.distinct()
				.collect(Collectors.toList());
	}
}
