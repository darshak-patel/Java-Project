package MT01;

import java.util.List;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private String name;
	private Integer age;
	private List<Pet> pet;
}
