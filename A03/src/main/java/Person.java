import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Person {
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;	
	
	@Builder
	@JsonCreator
	private static Person of(
			@JsonProperty("id") String id,
			@JsonProperty("firstName") String firstName,
			@JsonProperty("lastName") String lastName,
			@JsonProperty("age") Integer age,
			@JsonProperty("gender") String gender) {
		
		return new Person(id, firstName, lastName, age, gender);
	};
	
}